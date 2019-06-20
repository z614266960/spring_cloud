package com.imooc.order.controller;

import com.google.gson.Gson;
import com.imooc.order.client.ProductClient;
import com.imooc.order.dataobject.Product_info;
import com.imooc.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/20 9:06
 * @Description:
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){
//        RestTemplate restTemplate = new RestTemplate();

        //1 直接访问
//        String response = restTemplate.getForObject("http://localhost:9080/msg",String.class);

        //2.用loadBalancerClient负载均衡
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()) + "/msg";
//        String response = restTemplate.getForObject(url,String.class);

        //3.注册bean
//        String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);

        String response = productClient.productMsg();
        log.info("response = {}",response);
        return response;
    }

    @GetMapping("/getProductList")
    public String getProductList(){
        List<Product_info> list =  productClient.listForOrder(Arrays.asList("157875227953464068"));
        log.info(" resp : {}",list);
        return "ok";
    }

    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        productClient.decreaseStock(Arrays.asList(new CartDTO("157875227953464068",3)));
        return "ok";
    }
}
