package com.xiao.edu.configs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.xiao.edu.mappers")
public class EduConfig {
}
