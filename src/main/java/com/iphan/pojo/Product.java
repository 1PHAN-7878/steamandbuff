package com.iphan.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Product {
    public String productName;
    public double priceBuff;
    public double priceSteam;
    public String id;
    public Date lasttimeUpdate;

    public double getPriceBuff() {
        return priceBuff;
    }

    public void setPriceBuff(double priceBuff) {
        this.priceBuff = priceBuff;
    }

    public double getPriceSteam() {
        return priceSteam;
    }

    public void setPriceSteam(double priceSteam) {
        this.priceSteam = priceSteam;
    }



    public Product(String name, double priceBuff, double priceSteam, String id, Date lasttimeUpdate) {
        this.productName = name;
        this.priceBuff = priceBuff;
        this.priceSteam = priceSteam;
        this.id = id;
        this.lasttimeUpdate = lasttimeUpdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLasttimeUpdate() {
        return lasttimeUpdate;
    }

    public void setLasttimeUpdate(Date lasttimeUpdate) {
        this.lasttimeUpdate = lasttimeUpdate;
    }




    public Product() {
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }


}

