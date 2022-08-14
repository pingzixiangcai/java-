package com.pz.arr;

import java.util.Random;
import java.util.Scanner;

public class random_ranking {
    public static void main(String[] args) {
//        随机排名
//        1.创建数组 存储变量
        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + i+1 + "个要排序的变量：");
            int code = sc.nextInt();
//            存入数组
            arr[i] = code;
        }

//        2.交换位置
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");


        }


    }
}
