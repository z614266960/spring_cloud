package com.imooc.order.utils;

import com.imooc.order.ResultVO.ResultVO;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/19 17:24
 * @Description:
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);

        return resultVO;
    }

}
