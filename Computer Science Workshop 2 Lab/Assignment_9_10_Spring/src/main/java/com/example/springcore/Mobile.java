package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sim sim1 = (Sim) context.getBean("sim1");
        Sim sim2 = (Sim) context.getBean("sim2");

        System.out.println("Sim1:");
        sim1.calling();
        sim1.data();

        System.out.println("Sim2:");
        sim2.calling();
        sim2.data();
    }
} 