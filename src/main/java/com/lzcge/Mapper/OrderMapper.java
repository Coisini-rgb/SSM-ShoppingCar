package com.lzcge.Mapper;

import com.lzcge.Entity.tb_Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.persistence.criteria.CriteriaBuilder;

@Mapper
public interface OrderMapper {
    //创建新订单
    public void InsertOrder(@Param("orderCode")String OrderCode,@Param("TableId")Integer tableid,@Param("orderDate")String ordeDate);

    //删除指定id订单
    @Delete("delete from tb_order where id=#{orderid}")
    public Integer DeleteOrder(Integer orderid);

    //下单
    public void PlaceOrder(@Param("tableid")Integer id,@Param("price")Double price,@Param("payDate")String PayDate,@Param("Disable")Integer disabled);

}
