package com.ljo.crm.web.controller;

import com.ljo.crm.pojo.User;
import com.ljo.crm.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    private IUserService userService;

    @RequestMapping(value = {"/editor","/editor/{id}"}, method = RequestMethod.POST)
    public String addUser(@RequestParam Map param, @PathVariable(required = false) Integer id, ModelAndView modelAndView) {
        userService.updateUser(id, param);
        return "redirect:/user/users";
    }

    @RequestMapping("/users")
    public ModelAndView listUser(ModelAndView modelAndView) {
        List<User> list = userService.findAll();
        modelAndView.addObject("users", list);
        modelAndView.setViewName("/crm/user/userlist");
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String removeUser(@PathVariable Integer id) {
        userService.removeUser(id);
        return "redirect:/user/users";
    }

    @GetMapping("/table")
    @ResponseBody
    public Object tableProducts(@RequestParam Map param){
        return userService.tableUser(param);
    }
}
