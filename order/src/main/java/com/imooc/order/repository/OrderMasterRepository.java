package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Zhu Rui Jie
 * @Description //TODO
 * @Date 10:34 2019/6/19
 * @Param 
 **/
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
