package com.lzcge.Entity;

import java.util.Date;

public class tb_Order {
    //开启驼峰命名法，需要注意属性命名
    private Integer id;
    private String orderCode;
    private Integer tableId;
    private Double totalPrice;
    private String orderDate;
    private String payDate;
    private Integer Disabled;

    @Override
    public String toString() {
        return "tb_Order{" +
                "id=" + id +
                ", orderCode='" + orderCode + '\'' +
                ", tableId=" + tableId +
                ", totalPrice=" + totalPrice +
                ", orderDate='" + orderDate + '\'' +
                ", payDate='" + payDate + '\'' +
                ", Disabled=" + Disabled +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public Integer getDisabled() {
        return Disabled;
    }

    public void setDisabled(Integer disabled) {
        Disabled = disabled;
    }
}
