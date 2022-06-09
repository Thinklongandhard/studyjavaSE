package com.java.reflex;

/**
 * @anthor longway
 * @create 2022-04-08
 * 16:14
 */
/*
可变长参数:
     可变长参数： int..arg
     语法是： 类型...arg  (注意：一定是三个点)

     1、可变长度参数要求的参数个数是：0~N个。
     2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个。
     3、可变长度参数可以当做一个数组来看待。
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(1,2);//加入元素会从参数列表最后一个位置上加

        //m("abc");  //参数类型不同

        m1(100,"abc");

        m2("li","ting","luo","zhi","jia");

        //也可以传一个数组
        String[] str = {"a","c","d"};
        m2(str);
    }

    //可变长参数： int..arg
    public static void m(int...arg){
        System.out.println("m方法执行");
        //System.out.println(arg);
    }
    public  static void m1(int a,String...arg){
        System.out.println("m1方法执行");
        //System.out.println(arg);
    }
    public static void m2(String...args){
        //args有Length属性，说明args是一个数组
        //可以将可变长度参数当做一个数组来看待
        for (int i = 0 ; i < args.length ;i++){
            System.out.println(args[i]);
        }
    }
}
