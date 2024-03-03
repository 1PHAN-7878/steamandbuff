package com.iphan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.iphan.config","com.iphan.controller"})
@EnableWebMvc
public class SpringMvcConfig {
}
