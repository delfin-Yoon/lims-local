package com.gdl.lims.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.gdl.lims")
public class DatabaseConfig {

}
