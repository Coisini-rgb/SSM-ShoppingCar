package com.lzcge.ServiceImpl;

import com.lzcge.Entity.tb_Order;
import com.lzcge.Mapper.OrderDetailsMapper;
import com.lzcge.Mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements com.lzcge.Service.OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public void CreateOrder(String OrderCode,Integer TableId,String OrderDate) {
        orderMapper.InsertOrder(OrderCode,TableId,OrderDate);
    }

    @Autowired
    OrderDetailsMapper orderDetailsMapper;
    @Override
    public Integer DeleteOrder(Integer id) {
        orderDetailsMapper.DeleteAll(id);
        Integer status = orderMapper.DeleteOrder(id);
        return status;
    }

//    @Autowired
//    OrderDetailsMapper orderDetailsMapper;
//    @Override
//    public void PlaceOrder(Integer orderid, Double price, String payDate, Integer disabled) {
//
//        Double calCulateAll = orderDetailsMapper.CalCulateAll(orderid);
//
//        orderMapper.PlaceOrder(orderid,calCulateAll,);
//    }


}
