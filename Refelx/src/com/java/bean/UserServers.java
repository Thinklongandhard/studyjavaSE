package com.java.bean;

/**
 * @anthor longway
 * @create 2022-04-10
 * 12:35
 */
//true 登陆成功  false 登录失败
public class UserServers {

    private String name;
    public int number;
    protected int age;
    boolean sex;
    public static final double MAX = 10;



    public UserServers() {
        System.out.println("方法执行");
    }

    public boolean server(String name,String passWord){
        if("luozhijia".equals(name) && "123".equals(passWord)){
            return true;
        }else {
            return false;
        }
    }
    public void luo(){

    }


}
