package com.lzcge.Controller;

import com.lzcge.Entity.OrderDetails;
import com.lzcge.Service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {

    @Autowired
    OrderDetailService orderDetailService;

    /**
     * 选择商品，并记录到指定id的订单
     * @param orderId
     * @param foodId
     * @param buyNums
     * @return
     */
    @RequestMapping(value = "/OrderDetails",method = RequestMethod.POST)
    public String OrderDetails(Integer orderId,Integer foodId,Integer buyNums){
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrderId(orderId);
        orderDetails.setFoodId(foodId);
        orderDetails.setBuyNums(buyNums);
        orderDetailService.AddGoods(orderDetails);
        return "Success!";
    }

    /**
     * 修改已经选择过的商品数量
     * @param orderDetailsId
     * @param BuyNums
     * @return
     */
    @RequestMapping(value = "/UpdateBuyNums",method = RequestMethod.PUT)
    public String UpdateBuyNums(Integer orderDetailsId,Integer BuyNums){
        orderDetailService.UpdateButyNums(orderDetailsId,BuyNums);
        return "Success!";
    }

    /**
     * 删除订单中不想要的商品
     * @param detailsId
     * @return
     */
    @RequestMapping(value = "/DeleteDetails",method = RequestMethod.DELETE)
    public String DeleteDetails(Integer detailsId){
        orderDetailService.DeleteDetails(detailsId);
        return "Success!";
    }

    /**
     * 完成最后一步下单
     * @param orderid
     * @return
     */
    @RequestMapping(value = "/PlaceOrder",method = RequestMethod.POST)
    public String PlaceOrder(Integer orderid){

        orderDetailService.PlaceOrder(orderid);
        return "Success!";
    }
}
