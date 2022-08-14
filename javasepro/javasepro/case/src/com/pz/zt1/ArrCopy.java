package com.pz.zt1;

public class ArrCopy {
    public static void main(String[] args) {
//        1.定义数组
        int [] arr1 = {11,22,33,44};
        int [] arr2 = new int[arr1.length];
        copy(arr1,arr2);

        printArry(arr1);

        printArry(arr2);



    }
//    2.打印数组的方法
    public static void printArry(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1 ? arr[i] : arr[i]+",");
        }
        System.out.print("]"+"\n");

    }

//    3.把数组一复制给数组二的方法
    public static void copy(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
    }

}
