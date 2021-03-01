package com.lzcge.Controller;

import com.lzcge.Entity.tb_Order;
import com.lzcge.Mapper.OrderMapper;
import com.lzcge.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class OrderController {


    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/CreateOrder",method = RequestMethod.POST)
    public String CreateOrder(Integer tableid){
        Date date = new Date();
        tb_Order tb_order = new tb_Order();
        tb_order.setTableId(tableid);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String OrderCode = format.format(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String orderDate = simpleDateFormat.format(date);

        orderService.CreateOrder(OrderCode,tableid,orderDate);
        return "Success!";
    }


    @RequestMapping(value = "/DeleteOrder",method = RequestMethod.DELETE)
    public String Delete(@RequestParam("orderid") Integer orderid){
        orderService.DeleteOrder(orderid);
        return "Success";
    }


}
