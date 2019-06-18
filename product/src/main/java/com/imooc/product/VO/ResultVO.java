package com.imooc.product.VO;

import lombok.Data;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:28
 * @Description:
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;
}
