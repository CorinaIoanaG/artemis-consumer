package com.artemisconsumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "${jms.queue.destination}")
    public void receive(String msg) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Got Message: " + msg);
    }
}