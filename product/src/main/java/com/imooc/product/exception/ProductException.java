package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/20 14:15
 * @Description:
 */
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(Integer code,String msg){
        super(msg);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
