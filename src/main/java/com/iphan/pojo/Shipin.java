package com.iphan.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Shipin {
    public String name;
    public double price;

    public Shipin(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Shipin() {
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
}
