package com.imooc.product.service;

import com.imooc.product.dataObject.Product_info;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:01
 * @Description:
 */
public interface ProductService {

    List<Product_info> findUpAll();

}
