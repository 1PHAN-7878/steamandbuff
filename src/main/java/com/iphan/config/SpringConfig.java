package com.iphan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.iphan.controller", "com.iphan.pojo", "com.iphan.dao", "com.iphan.service"})
public class SpringConfig {
}
