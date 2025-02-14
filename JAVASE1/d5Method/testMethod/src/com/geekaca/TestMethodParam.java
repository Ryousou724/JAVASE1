package com.geekaca;

public class TestMethodParam {
    public static void main(String[] args) {
        /**
         *方法的参数传递机制
         */
        int a = 10;
        change(a);
        System.out.println("a =" + a);
    }
    public static void change(int num1){
        System.out.println("num1" + num1);
        num1 = 99;
        System.out.println("num1" + num1);

    }
}
