package com.pz.arr;

public class bobble_sorting {
    public static void main(String[] args) {
//        冒泡排序
//        1、定义一个数组，存储一些数据
        int [] arr ={1,9,6,5,7};

//        2、定义一个循环控制比较的轮数
        for (int i = 0; i < arr.length-1; i++) {
//            i  j
//            0  0 1 2 3
//            1  0 1 2
//            2  0 1
//            3  0
//            4

//            3、定义一个循环控制每轮比较的次数
            for (int j = 0; j < arr.length-i-1; j++) {
                // 判断j当前位置的元素值 是否 大于后一个位置 若较大 则交换
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
//             遍历数组内容输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
