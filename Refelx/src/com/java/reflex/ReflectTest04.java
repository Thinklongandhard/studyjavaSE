package com.java.reflex;

/**
 * @anthor longway
 * @create 2022-04-05
 * 20:55
 */
/*
单独实现静态代码块
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.java.reflex.Static");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



class Static{
    //静态代码块
    static {
        System.out.println("静态代码块执行");
    }

    public Static() {
        System.out.println("除了静态代码块，其他都不会执行！");
    }
}