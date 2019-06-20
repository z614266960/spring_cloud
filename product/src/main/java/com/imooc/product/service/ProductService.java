package com.imooc.product.service;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.dataObject.Product_info;

import java.util.List;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:01
 * @Description:
 */
public interface ProductService {

    List<Product_info> findUpAll();

    List<Product_info> findList(List<String> productIdList);

    void decreaseStock(List<CartDTO> cartDTOList);
}
