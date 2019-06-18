package com.imooc.product.repository;

import com.imooc.product.dataObject.Product_category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 15:55
 * @Description:
 */
public interface ProductCategoryRepository extends JpaRepository<Product_category,Integer> {

    List<Product_category> findByCategoryTypeIn(List<Integer> list);

}
