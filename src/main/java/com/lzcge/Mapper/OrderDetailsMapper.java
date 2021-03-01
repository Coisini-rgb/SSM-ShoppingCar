package com.lzcge.Mapper;

import com.lzcge.Entity.OrderDetails;
import org.apache.ibatis.annotations.*;

@Mapper
public interface OrderDetailsMapper {

    //加入订单详情
    public Integer InsertDetails(OrderDetails orderDetails);

    //修改商品数量
    @Update("update tb_order_details set buy_nums=#{buyNums},cost=#{cost} where id=#{id};")
    public void UpdateBuyNums(@Param("id") Integer id,@Param("buyNums") Integer buyNums,@Param("cost")Double cost);

    //获取商品id
    @Select("select food_id from tb_order_details where id = #{detailsId}")
    public Integer GetDetailsFoodId(Integer detailsId);

    @Delete("delete from tb_order_details where id = #{detailsId}")
    public void DeleteOrderDetails(Integer detailsId);


    //计算所有商品总价
    public Double CalCulateAll(Integer orderid);

    //删除所有同一订单的商品
    @Delete("delete from tb_order_details where order_id=#{orderID}")
    public void DeleteAll(Integer orderID);
}
