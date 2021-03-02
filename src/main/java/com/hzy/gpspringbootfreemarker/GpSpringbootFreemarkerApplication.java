package com.hzy.gpspringbootfreemarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@SpringBootApplication
public class GpSpringbootFreemarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpSpringbootFreemarkerApplication.class, args);
    }

//    @Bean
//    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
//        SimpleMappingExceptionResolver mapping = new SimpleMappingExceptionResolver();
//        Properties mappings = new Properties();
//        mappings.setProperty("java.lang.NullPointerException","error1");
//        mappings.setProperty("java.lang.ArithmeticException","error2");
//        mapping.setExceptionMappings(mappings);
//        return mapping;
//    }
}
