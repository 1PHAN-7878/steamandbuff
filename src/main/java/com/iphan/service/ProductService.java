package com.iphan.service;

import com.iphan.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ProductService {
    @Autowired
    ProductDao productDao;

    public ProductService() {
    }

    public String getProductById(String id) throws IOException {
        return productDao.getProductById(id);

    }
}
