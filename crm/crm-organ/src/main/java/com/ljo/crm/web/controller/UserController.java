package com.ljo.crm.web.controller;

import com.ljo.crm.dao.IUserDao;
import com.ljo.crm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:18
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserDao userDao;

    @RequestMapping(value = {"/editor","/editor/{id}"}, method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam Map param, @PathVariable(required = false) Integer id, ModelAndView modelAndView) {

        if(id == null || id.intValue() <= 0) {
            User user = new User();
            user.setLoginname("jb.liang");
            user.setSex(1);
            user.setUsername("梁剑波");
            user.setPassword("1");
            userDao.save(user);
            List<User> users = userDao.findAll();
            modelAndView.addObject("users", users);
        } else {

        }
        modelAndView.setViewName("/crm/user/userlist");
        return modelAndView;
    }

    @RequestMapping("/users")
    public ModelAndView listUser(ModelAndView modelAndView) {
        modelAndView.setViewName("/crm/user/userlist");
        return modelAndView;
    }
}
