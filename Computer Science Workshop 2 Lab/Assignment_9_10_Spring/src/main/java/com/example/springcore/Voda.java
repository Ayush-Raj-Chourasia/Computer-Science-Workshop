package com.example.springcore;

public class Voda implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling using Vodafone");
    }

    @Override
    public void data() {
        System.out.println("Browsing using Vodafone");
    }
} 