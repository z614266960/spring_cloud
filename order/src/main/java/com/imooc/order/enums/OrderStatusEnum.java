package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/19 10:38
 * @Description:
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINSHED(1,"完结"),
    CANCEL(2,"取消"),
    ;

    private Integer code;
    private String messsage;

    OrderStatusEnum(Integer code, String messsage) {
        this.code = code;
        this.messsage = messsage;
    }
}
