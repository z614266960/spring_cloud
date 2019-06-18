package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataObject.Product_info;
import com.imooc.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:11
 * @Description:
 */
@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private  ProductService productService;

    @Test
    public void findUpAll() {
        List<Product_info> list = productService.findUpAll();
        Assert.assertTrue(list.size()>0);
    }
}