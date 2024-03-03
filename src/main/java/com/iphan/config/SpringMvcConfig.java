package com.iphan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.iphan.config","com.iphan.controller"})
public class SpringMvcConfig {
}
