package com.imooc.product.repository;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataObject.Product_info;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 15:33
 * @Description:
 */
@Component
public class ProductInfoRepositoryTest extends ProductApplicationTests {


    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<Product_info> list = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(list.size()>0);
    }
}