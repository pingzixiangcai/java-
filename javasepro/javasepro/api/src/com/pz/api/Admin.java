package com.pz.api;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
//        登入系统 用户名和密码验证
//        1. 设置正确用户数据
        String okName="pz";
        String okPassword="123456";

//        2. for循环 3次验证机会
        for (int i = 1; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入用户名：");
            String name =sc.next();
            System.out.println("请您输入用户登入密码：");
            String password = sc.next();

//            判断是否一致
            if(name.equals(okName)){
                if(password.equals(okPassword)){
                    System.out.println("欢迎您进入三体空间！！！！！！");
                    break;
                }else{
                    System.out.println("不好意思，您输入的密码有误！还剩下"+(3-i)+"次机会");
                }
            }else{
                System.out.println("不好意思，您输入的用户名有误！还剩下"+(3-i)+"次机会");
            }

        }
    }
}
