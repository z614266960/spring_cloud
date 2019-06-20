package com.imooc.order.utils;

import java.util.Random;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/19 16:38
 * @Description:
 */
public class KeyUtil {

    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer num = random.nextInt(900000)+100000;

        return System.currentTimeMillis()+""+num;
    }

}
