package com.iphan.dao;

import java.util.List;

public interface ProductDatabaseDAO {

    public List<String> findLike(String nameLike);
}
