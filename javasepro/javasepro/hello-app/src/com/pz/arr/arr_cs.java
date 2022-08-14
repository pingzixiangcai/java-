package com.pz.arr;

import java.util.Random;
import java.util.Scanner;

public class arr_cs {
    public static void main(String[] args) {
//        猜数字游戏
//        1.定义动态随机数组
        int[] arr = new int[5];

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(20);
            System.out.print(arr[i] + "\t");
        }

//        2.设置死循环，比较数字
        Scanner sc = new Scanner(System.in);
//       OUT:
        while (true) {
            System.out.println("请输入一个猜数：");
            int cs = sc.nextInt();
            for (int i = 0; i < arr[i]; i++) {
                if (arr[i] == cs) {
                    System.out.println("恭喜你输入正确！该数字的索引是：" + i);
                    break;//break OUT;
                }
            }
            System.out.println("当前猜测的数字不在数组内，请重新猜测！");
        }
    }
}
