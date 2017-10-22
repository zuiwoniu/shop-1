package com.huan.business.po;

import java.math.BigDecimal;


/**
 * SOrders entity. @author MyEclipse Persistence Tools
 */

public class SOrders  implements java.io.Serializable {


    // Fields    

     private Long orderId;
     private Long productsId;
     private String productsName;
     private BigDecimal price;
     private BigDecimal num;
     private BigDecimal total;


    // Constructors

    /** default constructor */
    public SOrders() {
    }

    
    /** full constructor */
    public SOrders(Long productsId, String productsName, BigDecimal price, BigDecimal num, BigDecimal total) {
        this.productsId = productsId;
        this.productsName = productsName;
        this.price = price;
        this.num = num;
        this.total = total;
    }

   
    // Property accessors

    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductsId() {
        return this.productsId;
    }
    
    public void setProductsId(Long productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return this.productsName;
    }
    
    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNum() {
        return this.num;
    }
    
    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
   








}