package com.acn.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jaqcawaling on 7/6/17.
 */
    @Configuration
    @EnableAutoConfiguration
    @ComponentScan
    @SpringBootApplication(scanBasePackages={"com.acn.bootcamp.CitizenApiApp"})
    public class CitizenApiApp extends SpringBootServletInitializer{
        public static void main(String[] args){
            SpringApplication.run(CitizenApiApp.class, args);
        }

}
