package com.pz.zt1;

import java.util.Random;
import java.util.Scanner;

public class prize {
    public static void main(String[] args) {
//        模拟双色球抽奖系统
        int[] r = createArr();
        int[] u = userInput();
        System.out.println("您所购入的彩票号码为：");
        printArr(u);
        judge(r,u);

    }
//         1.随机生成一组中奖号码 6红1蓝
    public static int[] createArr(){
        System.out.println("-----------------正在随机生成本期的双色球号码----------------");
        Random r =new Random();
        int[] number = new int[7];


//     红球 1-33 为解决双色球不可重复的问题，定义了一个flag变量，默认为真，即data没有重复
        for (int i = 0; i < number.length-1; i++) {
            while(true){
                int data = r.nextInt(33) + 1;   //因为随机数是从0开始的，而要求是从1开始

                boolean flag = true;
                for (int j = 0; j < number.length-1; j++) {
                    if(number[j]==data){
                        flag=false;
                        break;
                    }

                }
                if(flag){
                    number[i]=data;
                    break;
                }
            }
        }
//        蓝球
        number[number.length-1] = r.nextInt(16) + 1;// 1-16

        return number;


    }

//         2.用户输入一组双色球号码
    public static int[] userInput(){
        Scanner sc = new Scanner(System.in);
        int[] number = new int[7];

        for (int i = 0; i <number.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位球的号码：");
            number[i] = sc.nextInt();

        }
        return number;



    }


//         3.判断中奖情况
    public static void judge(int[] r,int[] u){
//        代码分析技巧：预先设计几个数据
//        判断是否中奖了:不看顺序
//        luckynumber:1 11 12 13 14 15 16
//        usernumber:1 10 11 12 13 14 16
        int red_hit_number = 0;
        int blue_hit_number = 0;

//        判断红球个数
        for (int i = 0; i < u.length-1; i++) {
            for (int j = 0; j < r.length-1; j++) {
                if(u[i]==r[j]){
                    red_hit_number++;
                    break;
                }

            }

        }
//        判断蓝球个数
        blue_hit_number= u[6]==r[6] ? 1:0;


//        判断中奖情况
        if(blue_hit_number==1 && red_hit_number <3){
            System.out.println("5元小奖");
        }else if(blue_hit_number==1&&red_hit_number==3){
            System.out.println("10元小奖");
        }else if(blue_hit_number==1&&red_hit_number==4){
            System.out.println("200元小奖");
        }else if(blue_hit_number==1&&red_hit_number==5){
            System.out.println("3000元小奖");
        }else if(blue_hit_number==0&&red_hit_number==6){
            System.out.println("500万元大奖");
        }else if(blue_hit_number==1&&red_hit_number==6){
            System.out.println("1000万元大奖，诗和远方等你开启！");
        }else {
            System.out.println("谢谢你为福利彩票事业，做出的突出贡献！！！！");
            System.out.println("\n"+"揭晓本期的中奖号码：");
            printArr(r);
        }
    }





//    打印数组
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
        System.out.println("\n");
    }
}
