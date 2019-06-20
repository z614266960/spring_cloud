package com.imooc.product.service.impl;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.dataObject.Product_info;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.enums.ResultEnum;
import com.imooc.product.exception.ProductException;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:04
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<Product_info> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<Product_info> findList(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO : cartDTOList){
            Optional<Product_info> product_infoOptional = productInfoRepository.findById(cartDTO.getProductId());
            if(!product_infoOptional.isPresent()){
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Product_info product_info = product_infoOptional.get();
            int result = product_info.getProductStock() - cartDTO.getProductQuantity();

            if(result<0){
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            product_info.setProductStock(result);
            productInfoRepository.save(product_info);
        }
    }
}
