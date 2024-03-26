package com.iphan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.iphan.controller", "com.iphan.pojo", "com.iphan.dao", "com.iphan.service"})
@Import(com.iphan.config.MybatisConfig.class)
public class SpringConfig {
}
