package com.iphan.service;

import com.iphan.dao.ShiPinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ShipinService {
    @Autowired
    ShiPinDao shipinDao;

    public ShipinService() {
    }

    public String getShiPinByIdFromBuff(int num) throws IOException {
        return shipinDao.getShiPinByIdFromBuff(num);
    }
}
