package com.lzcge.Service;

import com.lzcge.Entity.tb_Order;

public interface OrderService {

    //创建新的订单
    public void CreateOrder(String OrderCode,Integer TableId,String OrderDate);

    //删除指定id的订单
    public Integer DeleteOrder(Integer id);

//    //下单
//    public void PlaceOrder(Integer orderid,Double price,String payDate,Integer disabled);
}
