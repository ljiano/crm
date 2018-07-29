package com.ljo.crm.web.controller;

import com.ljo.crm.web.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/7/25
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @RequestMapping("/list")
    public ModelAndView listCompanys(ModelAndView modelAndView){
        List list = companyService.findCompanys(new HashMap());
        if(!CollectionUtils.isEmpty(list)){
            modelAndView.addObject("companys", list);
        }
        modelAndView.setViewName("/crm/listcompanys");
        return modelAndView;
    }

    @GetMapping("/table")
    @ResponseBody
    public Object tableCompanys(@RequestParam Map param){
        return companyService.tableCompanys(param);
    }
}
