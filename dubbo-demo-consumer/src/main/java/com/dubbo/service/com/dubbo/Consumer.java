package com.dubbo.service.com.dubbo;

import com.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Lins
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String world = demoService.sayHello("world");
        System.out.println(world);
    }
}
