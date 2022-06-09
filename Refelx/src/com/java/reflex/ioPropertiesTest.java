package com.java.reflex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-04-05
 * 21:42
 */
/*
获取绝对路径，直接以流的方法返回
 */
public class ioPropertiesTest {
    public static void main(String[] args) {
        /*//老方法
        String reader = Thread.currentThread().getContextClassLoader()
                .getResource("根路径").getPath();
        try {
            FileReader fr = new FileReader(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


        //新方法
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo2.properties");
        Properties pro = new Properties();
        try {
            //加载流
            pro.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
