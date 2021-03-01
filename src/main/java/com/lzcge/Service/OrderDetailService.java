package com.lzcge.Service;

import com.lzcge.Entity.OrderDetails;

public interface OrderDetailService {
    //添加购物商品
    public void AddGoods(OrderDetails orderDetails);

    //修改商品数量并修改小计cost的值
    public void UpdateButyNums(Integer orderDetailsId,Integer BuyNums);

    //删除订单中的某一件商品
    public void DeleteDetails(Integer detailsId);

    //下单
    public void PlaceOrder(Integer orderId);

}
