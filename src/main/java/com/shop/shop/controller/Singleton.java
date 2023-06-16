package com.shop.shop.controller;

public class Singleton { //1

    private static Singleton instance = new Singleton(); //2

    private Singleton() { //3

    }

    public static Singleton getInstance() { //4
        return instance;   //5
    }

    public void say() {
        System.out.println("hi, there");
    }
}
