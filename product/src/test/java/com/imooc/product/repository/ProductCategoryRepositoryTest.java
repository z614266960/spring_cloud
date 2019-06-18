package com.imooc.product.repository;

import com.imooc.product.ProductApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 15:58
 * @Description:
 */
@Component
public class ProductCategoryRepositoryTest extends ProductApplicationTests {


    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11,22));
        Assert.assertTrue(list.size()>0);
    }
}