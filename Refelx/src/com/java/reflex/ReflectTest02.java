package com.java.reflex;

import com.java.bean.User;

/**
 * @anthor longway
 * @create 2022-04-05
 * 15:37
 */
/*获取Class
*
*    重点：   newInstance()调用的无参数构造方法，必须保证无参数构造方法的存在
* */
public class ReflectTest02 {
    public static void main(String[] args) {

        User user = new User();
        //已经写死了是User

        //灵活性高，并没有写死User对象，可以更改
        try {
            //通过反射机制获取Class，通过Class来实例化对象
            Class c = Class.forName("com.java.bean.User");   //c表示User类型

            //newInstance()这个方法会调用User这个类的无参构造方法，完成对象的创建
            //重点：   newInstance()调用的无参数构造方法，必须保证无参数构造方法的存在
            Object obj = c.newInstance();
            System.out.println(obj);     //com.java.bean.User@4554617c新建对象地址

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
