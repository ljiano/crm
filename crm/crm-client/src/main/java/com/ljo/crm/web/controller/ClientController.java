package com.ljo.crm.web.controller;

import com.ljo.crm.pojo.Client;
import com.ljo.crm.web.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jb.liang
 * Date: 2018/6/23
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public ModelAndView listClients(ModelAndView modelAndView) {
        List<Client> clientList = clientService.findClients();
        modelAndView.addObject("clients", clientList);
        modelAndView.setViewName("/crm/client/clientlist");
        return modelAndView;
    }

    @RequestMapping(value = {"/editor","/editor/{id}"}, method = RequestMethod.POST)
    public String addClient(@RequestParam Map properties, @PathVariable(required = false) Integer id, ModelAndView modelAndView) {
        clientService.saveOrUpdateClient(id, properties);
        return "redirect:/client/clients";
    }

    @RequestMapping("/select")
    @ResponseBody
    public Object saveClient(@RequestParam Map properties) {
        return clientService.saveAndSelectClient(properties, 1);
    }
}
