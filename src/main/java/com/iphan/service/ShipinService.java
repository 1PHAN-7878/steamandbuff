package com.iphan.service;

import com.iphan.dao.ShipinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ShipinService {
    @Autowired
    ShipinDao shipinDao;

    public ShipinService() {
    }

    public String getShipinById(int num) throws IOException {
        return shipinDao.getShipinById(num);

    }
}
