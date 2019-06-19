package com.imooc.ResultVO;

import lombok.Data;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/19 17:23
 * @Description:
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
