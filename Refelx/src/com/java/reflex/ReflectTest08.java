package com.java.reflex;

/**
 * @anthor longway
 * @create 2022-04-11
 * 14:52
 */
/*
反射父类和父类的接口
    反射父类：  类名对象.getSuperclass()

    反射父类实现的所有接口名：   反射的父类对象.getInterfaces();
 */
public class ReflectTest08 {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("java.lang.String");
            Object obj = c.newInstance();
            //反射String的父类
            Class superClass = c.getSuperclass();
            System.out.println(superClass.getName());

            //反射父类实现的接口
            Class[] interfaces = c.getInterfaces();
            for(Class in : interfaces){
                System.out.println(in.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
