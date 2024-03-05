package com.iphan.service;


import com.iphan.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TimeToDo {
    //暂定为这种的形式，之后再改动
    double price;
    @Autowired
    ProductDao productDao;
    @Scheduled
    public void searchForBalisong() throws IOException {
        price = Double.parseDouble(productDao.getProductById("42530"));
    }
}
