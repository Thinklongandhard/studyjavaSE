package com.java.reflex;

import java.util.Date;

/**
 * @anthor longway
 * @create 2022-04-05
 * 14:15
 */
/*
获取字节码的三种方式：
     1、Class c = Class.forName("完整的类名带包名");
     2、Class c = 对象.Class();
     3、Class c = 任何类名.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        //one
        /*
        * Class.forName("");  是静态方法
        *     方法的参数是一个字符串
        *     字符串需要是一个完整的类名
        *     完整类名必须包括包名，java.lang包也不能省略
        * */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");    //获取String类型的字节码文件
            Class c2 = Class.forName("java.util.Date");      //获取Date类型的字节码文件
            Class c3 = Class.forName("java.lang.Integer");   //获取Integer类型字节码文件
            Class C4 = Class.forName("java.lang.System");    //获取System类型字节码文件
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //two
        //java中任何一个对象都有一个方法：getClass()
        String s = new String();
        Class a = s.getClass();
        System.out.println(a == c1);   //比较的是内存地址

        //three
        Class b = String.class;
        Class c = Date.class;
        Class d = System.class;
        Class e = int.class;
        System.out.println(a == b);

    }
}
