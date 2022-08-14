package com.pz.createclass;

public class Student {
//    成员变量
    String name;
    int age;
    String sex;
    String major;

//    成员方法
    public void study(){
        System.out.println("身为一名学生，"+(sex == "男" ?"他":"她")+"每天学习10小时");

    }
    public void sleep(){
        System.out.println("身为一名学生，"+(sex =="男" ?"他":"她")+"每天有8小时的睡眠时间。");

    }
}
