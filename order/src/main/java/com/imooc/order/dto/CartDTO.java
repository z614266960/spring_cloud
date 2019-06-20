package com.imooc.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/20 11:16
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {

    private String productId;

    private Integer productQuantity;


}
