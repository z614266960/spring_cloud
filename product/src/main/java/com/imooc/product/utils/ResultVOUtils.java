package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/18 16:57
 * @Description:
 */
public class ResultVOUtils {

    public static ResultVO success(Object o){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(o);
        return resultVO;
    }
}
