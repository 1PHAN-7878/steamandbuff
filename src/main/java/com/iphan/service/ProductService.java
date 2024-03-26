package com.iphan.service;

import com.iphan.dao.ProductDao;
import com.iphan.dao.ProductDatabaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductDao productDao;
    @Autowired
    ProductDatabaseDAO productDatabaseDAO;
    public ProductService() {
    }

    public String getProductById(String id) throws IOException {
        return productDao.getProductById(id);

    }
    public List<String> getProductLike(String nameLike){
        return productDatabaseDAO.findLike(nameLike);
    }
}
