package com.imooc.utils;

import java.util.Random;
import java.util.UUID;

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
