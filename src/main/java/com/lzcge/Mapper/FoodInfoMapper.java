package com.lzcge.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodInfoMapper {

    @Select("select foods_price from tb_foods where id=#{foodid}")
    public Double GetFoodPRice(Integer foodid);
}
