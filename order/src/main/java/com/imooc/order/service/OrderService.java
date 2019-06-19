package com.imooc.order.service;

import com.imooc.dto.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * @Author: ZhuRuiJie
 * @Date: 2019/6/19 11:05
 * @Description:
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
