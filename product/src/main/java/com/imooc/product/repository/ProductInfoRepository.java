package com.imooc.product.repository;

import com.imooc.product.dataObject.Product_info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 15:31
 * @Description:
 */
public interface ProductInfoRepository extends JpaRepository<Product_info,String> {

    List<Product_info> findByProductStatus(Integer productStatus);

    List<Product_info> findByProductIdIn(List<String> productIdList);

}
