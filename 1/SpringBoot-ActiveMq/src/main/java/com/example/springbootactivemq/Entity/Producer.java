package com.example.springbootactivemq.Entity;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: com.example.springbootactivemq.Entity
 * @Author: soreak
 * @create: 2021/8/13 14:46
 */
@Component
@EnableScheduling
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Scheduled(fixedDelay = 5000)
    public void send() {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "test activeMq!");
        System.out.println("message send success !");
    }

}
