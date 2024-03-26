package com.iphan.config;

import com.iphan.dao.ProductDatabaseDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

@Configuration

public class MybatisConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    @Bean
    public SqlSession sqlSession() throws IOException {
        return sqlSessionFactory().openSession();
    }

    @Bean
    public ProductDatabaseDAO productDatabaseDAO() throws IOException {
        return sqlSession().getMapper(ProductDatabaseDAO.class);
    }
}
