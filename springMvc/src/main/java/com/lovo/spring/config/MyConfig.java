package com.lovo.spring.config;

import com.lovo.spring.entity.StudentEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public StudentEntity studentEntity(){
        StudentEntity studentEntity = new StudentEntity("鲁班",22);
        return studentEntity;
    }

}
