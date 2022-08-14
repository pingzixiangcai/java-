package com.pz.zt1;

public class SuShu {
    public static void main(String[] args) {
//        找101--200之间的素数 素数只能被1和自身整除的数字    技巧：信号位思想
        int c=0;

        for (int i = 101; i <=200 ; i++) {

            boolean flag = true;//真代表是素数

            for (int j = 2; j < i/2 ; j++) {
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                c++;
                System.out.print(i+"\t");
            }

        }
        System.out.println("\n"+"总共有" + c + "个素数");

    }
}
