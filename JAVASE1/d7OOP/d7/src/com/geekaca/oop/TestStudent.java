package com.geekaca.oop;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "游戏";

        Student s2 = s1;
        s2.hobby = "学习";
        System.out.println(s1.name);
        System.out.println(s1.hobby);
    }
}
