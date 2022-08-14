package com.pz.zt1;

import javax.swing.*;
import java.util.Scanner;

public class JudgeScore {
    public static void main(String[] args) {
//        评委打分
//        1.定义一个动态数组
        int [] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入打分：");
            int score = sc.nextInt();
            scores[i] = score;
        }

//        2.求平均分
        int max=0,min=0,sum=0;

        for (int i = 0; i < scores.length; i++) {

            if(scores[i]>max){
                max=scores[i];
            }
            if(scores[i]<min){
                min = scores[i];
            }
            sum+=scores[i];

        }
        double avg =((sum -max -min)*1.0)/(scores.length-2);

        System.out.println("最终得分为："+avg);

    }

}
