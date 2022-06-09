package com.java.reflex;

import java.lang.reflect.Field;

/**
 * @anthor longway
 * @create 2022-04-10
 * 17:08
 */
/*
通过反射机制获取属性
 */
public class ReflectTest06 {
    public static void main(String[] args) {
        Class c = null;
        try {
            //获取UserServers 的class
            c = Class.forName("com.java.bean.UserServers");
            //创建对象
            Object obj = c.newInstance();  //obj 就是UserServers对象（底层调用无参数构造）
            //根数属性名称获取属性
            Field field = c.getDeclaredField("number");
            field.set(obj,1111);
            //获取属性的值

            //私有的属性无法访问，访问时需要打破封装
            Field f = c.getDeclaredField("name");
            //打破封装
            f.setAccessible(true);
            f.set(obj,"luo");
            System.out.println(f.get(obj));

            System.out.println(field.get(obj));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
