package com.imooc.product.service;

import com.imooc.product.dataObject.Product_category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:19
 * @Description:
 */
public interface CategoryService{

    List<Product_category> findByCategoryTypeIn(List<Integer> list);
}
