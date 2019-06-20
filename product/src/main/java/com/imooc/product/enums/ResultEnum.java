package com.imooc.product.enums;

import lombok.Getter;
import lombok.AllArgsConstructor;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/20 14:17
 * @Description:
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1,"商品不存在"),

    PRODUCT_STOCK_ERROR(2,"库存有误"),
    ;

    private Integer code;

    private String message;


}
