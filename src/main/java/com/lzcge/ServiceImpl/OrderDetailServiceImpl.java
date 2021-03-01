package com.lzcge.ServiceImpl;

import com.lzcge.Entity.OrderDetails;
import com.lzcge.Mapper.FoodInfoMapper;
import com.lzcge.Mapper.OrderDetailsMapper;
import com.lzcge.Mapper.OrderMapper;
import com.lzcge.Service.OrderDetailService;
import com.lzcge.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailsMapper orderDetailsMapper;
    @Autowired
    FoodInfoMapper foodInfoMapper;

    @Override
    public void AddGoods(OrderDetails orderDetails) {
        Double foodPRice = foodInfoMapper.GetFoodPRice(orderDetails.getFoodId());
        orderDetails.setCost(foodPRice*orderDetails.getBuyNums());
        orderDetailsMapper.InsertDetails(orderDetails);

    }

    @Override
    public void UpdateButyNums(Integer orderDetailsId, Integer BuyNums) {
        Integer detailsFoodId = orderDetailsMapper.GetDetailsFoodId(orderDetailsId);
        System.out.println(detailsFoodId);
        Double price=foodInfoMapper.GetFoodPRice(detailsFoodId);
        System.out.println(price);
        orderDetailsMapper.UpdateBuyNums(orderDetailsId,BuyNums,price*BuyNums);
    }

    @Override
    public void  DeleteDetails(Integer detailsId) {
        orderDetailsMapper.DeleteOrderDetails(detailsId);
    }

    @Autowired
    OrderMapper orderMapper;
    @Override
    public void PlaceOrder(Integer orderId) {
        Double SumCost = orderDetailsMapper.CalCulateAll(orderId);
        System.out.println(SumCost);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String payDate = simpleDateFormat.format(new Date());
        Integer Disable=1;
       orderMapper.PlaceOrder(orderId,SumCost,payDate,Disable);
    }
}
