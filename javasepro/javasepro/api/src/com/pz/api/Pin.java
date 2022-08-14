package com.pz.api;

import java.util.Random;

public class Pin {
    public static void main(String[] args) {
//        利用string字符串，创建五位随机验证码
//        1.定义验证码的取值范围
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        2. 循环五次，生成5个随机数的索引
        String pin ="";
        Random r =  new Random();

        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(datas.length());
            char ch = datas.charAt(index);
            pin += ch;
        }
        System.out.println(pin);

    }
}
