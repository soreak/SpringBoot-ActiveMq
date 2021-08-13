package com.example.springbootactivemq;

import org.apache.activemq.command.ActiveMQQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringBootActiveMqApplication {

    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue("testQueue");
    }

    protected static Logger logger = LoggerFactory.getLogger(SpringBootActiveMqApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringBootActiveMqApplication.class, args);
        logger.info("Springboot start");
    }

}
