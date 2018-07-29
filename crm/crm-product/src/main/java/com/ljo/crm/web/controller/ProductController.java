package com.ljo.crm.web.controller;

import com.ljo.crm.pojo.Product;
import com.ljo.crm.web.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * creator : jb.liang
 * time : 14:18
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = {"/editor","/editor/{id}"}, method = RequestMethod.POST)
    public String addProduct(@RequestParam Map param, @PathVariable(required = false) Integer id, ModelAndView modelAndView) {
        productService.updateProduct(id, param);
        return "redirect:/product/products";
    }

    @RequestMapping("/products")
    public ModelAndView listProduct(ModelAndView modelAndView) {
        List<Product> list = productService.findAll();
        modelAndView.addObject("products", list);
        modelAndView.setViewName("/crm/product/productlist");
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String removeProduct(@PathVariable Integer id) {
        productService.removeProduct(id);
        return "redirect:/product/products";
    }

    @GetMapping("/table")
    @ResponseBody
    public Object tableProducts(@RequestParam Map param){
        return productService.tableProducts(param);
    }
}
