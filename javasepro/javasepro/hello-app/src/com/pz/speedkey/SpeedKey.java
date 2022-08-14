package com.pz.speedkey;

import java.util.Random;
import java.util.Scanner;

public class SpeedKey {
    public static void main(String[] args) {

//        // if分支结构 案例：心跳范围
//        int pulse=50;
//        if(pulse >= 60 && pulse <= 100)
//        {
//            System.out.println("正常");
//        }
//        else {
//            System.out.println("不正常");
//        }
//
//        //switch 分支结构 日常事件
//        String weekday = "1";
//        switch (weekday) {
//            case "周一":
//                System.out.println("埋头苦干，解决bug");
//                break;
//            case "周二":
//                System.out.println("埋头苦干，解决bug");
//                break;
//            case "周三":
//                System.out.println("埋头苦干，解决bug");
//                break;
//            case "周四":
//                System.out.println("埋头苦干，解决bug");
//                break;
//            case "周五":
//                System.out.println("埋头苦干，解决bug");
//                break;
//            case "周六":
//                System.out.println("摆。。。。。。。。。");
//                break;
//            case "周日":
//                System.out.println("埋头苦干，解决bug");
//                break;
//            default:
//                System.out.println("诶 有这日子吗？异世界的话，whatever 干啥");
//                break;
//        }


//// 求和
//            int sum = 0;
//            for(int i=1;i<=10;i++){
//                if (i % 2== 1) {
//                    sum += i;
//                    System.out.println(i);
//                }
//            }
//            System.out.println(sum);




////        水仙花数
//        int count=0;
//        for (int i=100;i<=999;i++){
//            int ge = i/100 ;
//            int shi = i/10%10;
//            int bai = i%10;
//            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
//            {
//            System.out.println("水仙花数是" + i);
//            count = count+1;
//            }
//
//        }
//        System.out.println("水仙花数的个数"+count);

//
//
////    折叠纸张等于珠穆朗玛峰的次数
//        double peakHeight=8848860;
//        double paperThickness=0.1;
//        int count = 0;
//        while(paperThickness <= peakHeight){
//            paperThickness = paperThickness*2;
//            count++;
//            System.out.println(count);
//        }


////        嵌套循环：打印四行五列的星号矩阵
////        way1
//        for (int i = 0; i <4; i++) {
//            System.out.println("*****");
//        }
////        way2
//        for (int i = 0; i <4; i++) {
//            for (int j = 0; j <5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//

//猜数字游戏
//        定义一个随机数
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println("随机数已生成,请用户输入一个你所猜测的数字：");

//        设置死循环
        while(true){
            int cs =sc.nextInt();//记住要把输入放在循环内部，不然不能进行下一次猜测
            if(cs > num){
                System.out.println("不好意思，你猜大啦！请再试试！！！");
            }
            else if(cs < num){
                System.out.println("不好意思，你猜小啦！请再试试！！！");
            }
            else{
                System.out.println("恭喜你，输入正确！正确的随机数是"+num); break;
            }
        }

    }

}
