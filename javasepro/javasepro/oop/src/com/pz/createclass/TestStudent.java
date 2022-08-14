package com.pz.createclass;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name = "罗翔");
        System.out.println(s.age = 18);
        System.out.println(s.sex = "男");
        s.study();
        s.sleep();
        System.out.println("\n");
        Student s1 = new Student();
        System.out.println(s1.name = "叶文洁");
        System.out.println(s1.age = 20);
        System.out.println(s1.sex = "女");
        s1.study();
        s1.sleep();
    }


}
