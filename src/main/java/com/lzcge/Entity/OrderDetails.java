package com.lzcge.Entity;

public class OrderDetails {
    private Integer Id;
    private Integer orderId;
    private Integer foodId;
    private Integer buyNums;
    private Double cost;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "Id=" + Id +
                ", orderId=" + orderId +
                ", foodName='" + foodId + '\'' +
                ", buyNums=" + buyNums +
                ", buyNums=" + cost +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }





    public Integer getBuyNums() {
        return buyNums;
    }

    public void setBuyNums(Integer buyNums) {
        this.buyNums = buyNums;
    }
}
