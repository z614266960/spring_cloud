package com.imooc.product.controller;

import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/20 8:58
 * @Description:
 */
@RestController
public class ServerController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/msg")
    public String msg(){
        return "this is product msg";
    }

    @RequestMapping("/listForOrder")
    public List listForOrder(@RequestBody List<String> productIdList){
        return productService.findList(productIdList);
    }
}
