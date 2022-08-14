package com.pz.zt1;

import java.util.Scanner;

public class BuyTicket {
    public static void main(String[] args) {
//       目标：完成买飞机票的计算
//        1。提示用户输入购买筛选条件
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要购买的原票价：");
        double money = sc.nextDouble();

        System.out.println("请输入所购机票的月份：");
        int month = sc.nextInt();

        System.out.println("请输入选择的仓位类型：");
        String type = sc.next();

//        调用方法
        System.out.println(calc(month, money, type));
    }

    //    2.定义票价计算的方法
    public static double calc(int month, double money, String type) {
//        旺季
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的仓位类型的数据有误！");
                    money = -1;
                    break;
            }
        } else if (month == 11 || month == 12 || (month >= 1 && month <= 4)) {
//            淡季
            switch (type) {
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的仓位类型的数据有误！");
                    money = -1;
                    break;
            }
//            输入错误
        } else {
            System.out.println("您输入的月份有误！");
            money = -1;
        }
        return money;
    }
}

