package com.java.reflex;

import java.util.Calendar;
import java.util.ResourceBundle;

/**
 * @anthor longway
 * @create 2022-04-05
 * 21:54
 */
/*
java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
使用一下这种方式的时候，属性配置文件xxx.properties必须放到类路径下
 */

public class ResourceBundleTest {
    public static void main(String[] args) {

        //资源绑定器，只能绑定xxx.properties文件。并且这个文件必须在类路径下，文件扩展名也必须是properties
        //并且在写路径的时候，路径后面的扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
