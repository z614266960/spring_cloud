package com.imooc.order.client;

import com.imooc.order.dataobject.Product_info;
import com.imooc.order.dto.CartDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/20 9:50
 * @Description:
 */
@FeignClient("product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();

    @PostMapping("product/listForOrder")
    List<Product_info> listForOrder(List<String> productIdList);

    @PostMapping("product/decreaseStock")
    void decreaseStock(@RequestBody List<CartDTO> cartDTOList);
}
