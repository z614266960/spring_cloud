package com.imooc.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/19 16:57
 * @Description:
 */
public class OrderException extends RuntimeException{

    private Integer code;

    public OrderException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
