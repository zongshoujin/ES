/** 
 * Project Name:ES 
 * File Name:Hotel.java 
 * Package Name:com.ly.es.entity 
 * Date:2015年5月23日下午9:20:27 
 * Copyright (c) 2015, zongsj2008@163.com All Rights Reserved. 
 * 
*/  
  
package com.ly.es.entity;  
/** 
 * ClassName:Hotel <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年5月23日 下午9:20:27 <br/> 
 * @author   zongshoujin 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Hotel {

    private int id;
    
    private String name;
    
    private double price;
    
    private String address;
    
    public Hotel() {
    }

    public Hotel(int id, String name, double price, String address, String cityId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
        this.cityId = cityId;
    }

    private String cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
  