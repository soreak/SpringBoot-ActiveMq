package com.example.springbootactivemq.Entity;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: com.example.springbootactivemq.Entity
 * @Author: soreak
 * @create: 2021/8/13 14:48
 */
@Component
public class Consumer {

    @JmsListener(destination = "testQueue")
    public void receive(String consumer){
        System.out.println(consumer + "Already consumed");
    }
}
