package com.java.reflex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-04-05
 * 15:56
 */
/*
验证反射机制的灵活性:
     java代码写一遍，就不需要改变java源代码的基础之上，可以做到不同对象的实例化。
     非常灵活（符合OCP开闭原则：对扩展开放，对修改关闭）

 后期学习的高级框架，他们实现的底层原理：都采用了反射机制。所以反射机制很重要，
 学会了反射机制有利于对框架底层源代码的理解和剖析
 */
public class ReflectTest03 {
    public static void main(String[] args) {
        //通过IO流进行读取
        FileReader reader = null;
        try {
            reader = new FileReader("E:\\work2020\\IDEA\\IDEAProject\\Thread\\Refelx\\classinfo.properties");
            //新建属性类对象Map
            Properties pro = new Properties();
            //加载
            pro.load(reader);
            String className1 = pro.getProperty("className");
            Class c = Class.forName(className1);
            Object obj = c.newInstance();
            System.out.println(obj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
