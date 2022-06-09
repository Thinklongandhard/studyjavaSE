package com.java.reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @anthor longway
 * @create 2022-04-10
 * 12:40
 */
/*
利用反射机制获取方法
 */
public class ReflectTest05 {
    public static void main(String[] args) {
        //获取根路径
        /*
        String s = Thread.currentThread().getContextClassLoader().getResource("com/java/bean/UserServers.class").getPath();
        System.out.println(s);
        */


        Class c = null;
         //反射机制
        try {
            //获取UserServes类
            c = Class.forName("com.java.bean.UserServers");
            //创建对象
            Object obj1 = c.newInstance();
            //System.out.println(obj1);
            //获取方法  -->Method(方法)
            //java 中区分方法是从方法名和参数列表来区分的
            //属性.class 可以获取到class
            Method method = c.getDeclaredMethod("server",String.class,String.class);


            /*
            调用方法
               四要素：
                  有一个Method对象
                  obj对象；
                  方法中用到的实参
                  返回值
             */
            Object reVale = method.invoke(obj1,"luo","123");
            System.out.println(reVale);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
