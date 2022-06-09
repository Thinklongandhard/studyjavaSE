package com.java.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-04-05
 * 20:31
 */
/*
验证反射机制的灵活性
 */
public class reflect03 {
    public static void main(String[] args) {
        //用流来读取配置文件
        FileInputStream f = null;
        try {
            f = new FileInputStream("E:\\work2020\\IDEA\\IDEAProject\\Thread\\Refelx\\classinfo.properties");
            //新建MAP集合
            Properties pro = new Properties();
            //把读取出来的文件f加载到集合中
            pro.load(f);
            //通过key 和 value读取
            String str = pro.getProperty("className");
            //反射机制，通过全部类名加包名找到class文件
            Class c = Class.forName(str);
            Object obj = c.newInstance();  //新建obj对象
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
            //关闭流
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
