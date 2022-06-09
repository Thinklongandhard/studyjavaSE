package com.java.reflex;

import java.io.FileInputStream;

/**
 * @anthor longway
 * @create 2022-04-05
 * 21:11
 */
/*'
文件路径问题

 */
public class AboutPath {
    public static void main(String[] args) {
        /*
        这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的跟。
        当离开了IDEA以后，就找不到了这个时候路径就无效了。
        */
        //FileInputStream fileInputStream = new FileInputStream("Refelx\classinfo.properties");

        //注意：下列方法只能在文件在类路径下的情况时适用，放在类路径以外无法使用

        //这种办法是通用方法，无论在哪里都是适用的
        //什么是类路径：   凡是在 src 路径下的都是类路径。
        //src  是类的根路径
        //Thread.currentThread()  获取当前线程
        //.getContextClassLoader()  是线程对象的方法，可以获取到当前线程的类加载器对象
        //.getResource("classinfo2.properties")  【获取资源】 类加载器对象的方法，当前线程的类加载器默认从类的跟路径下加载资源
        //.getPath()   返回一个String类型的绝对路径
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        //获取到的绝对路径
        ///E:/work2020/IDEA/IDEAProject/Thread/out/production/Refelx/classinfo2.properties
        System.out.println(path);



        //获取bean下的ic.properties配置文件
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/java/bean/ic.properties").getPath();
        //获取到的绝对路径
        ///E:/work2020/IDEA/IDEAProject/Thread/out/production/Refelx/com/java/bean/ic.properties
        System.out.println(path2);
    }
}
