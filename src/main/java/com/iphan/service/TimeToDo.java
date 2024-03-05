package com.iphan.service;

import com.iphan.dao.ShipinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TimeToDo {
    //暂定为这种的形式，之后再改动
    double price;
    @Autowired
    ShipinDao shipinDao;
    @Scheduled
    public void searchForBalisong() throws IOException {
        price = Double.parseDouble(shipinDao.getShipinById(42530));
    }
}
