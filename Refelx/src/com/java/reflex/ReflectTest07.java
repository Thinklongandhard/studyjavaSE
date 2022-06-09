package com.java.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor longway
 * @create 2022-04-11
 * 14:19
 */
/*
反射Constructor  //构造方法
    实例化对象
 */
public class ReflectTest07 {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.java.bean.Student");
            //无参构造
            Object student = c.newInstance();
            //反射含有参数的构造方法
            Constructor ageAndnumber = c.getDeclaredConstructor(int.class,int.class);
            //传入参数
            Object aab = ageAndnumber.newInstance(10,110);
            System.out.println(aab);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
