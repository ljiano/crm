package com.ljo.crm.web.controller;

import com.ljo.crm.web.service.IClientPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/clientperiod")
public class ClientPeriodController {

    @Autowired
    private IClientPeriodService clientPeriodService;

    @GetMapping("/cps/{oId}")
    @ResponseBody
    public Object listClientPeriods(@PathVariable Integer oId) {
        return clientPeriodService.listClientPeriods(oId);
    }
}
