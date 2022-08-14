package com.pz.zt1;

import java.util.Scanner;

import static com.pz.zt1.ArrCopy.printArry;

public class PW {
    public static void main(String[] args) {
//        数字加密
//        1.定义动态数组 设置他的长度
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入密码长度：");
        int length = sc.nextInt();
        int [] pws= new int[length];
//        2.存储密码
        for (int i = 0; i < pws.length; i++) {
            System.out.println("请输入密码的第"+ (i+1)+"位：");
            int pw = sc.nextInt();
            pws[i]=pw;
        }
//        3.打印代码
        printArry(pws);
//        4.核心逻辑
        for (int i = 0; i < pws.length; i++) {
            pws[i]=(pws[i]+5)%10;
        }
        for (int i = 0,j = length - 1; i < j; i++,j--) {
            int temp = pws[j];
            pws[j] = pws[i];
            pws[i] = temp;

        }
//        5.打印加密后的代码
        printArry(pws);

    }
}
