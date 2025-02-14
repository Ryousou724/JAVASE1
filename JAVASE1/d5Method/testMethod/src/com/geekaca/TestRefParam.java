package com.geekaca;

public class TestRefParam {
    public static void main(String[] args) {
        /**
         * 引用类型作为函数参数
         */
        int[] myArr = {10, 20, 30};
        change(myArr);

        System.out.println("myArr[1] =" + myArr[1]);
        System.out.println("----------函数内部指向新的数组------------");
        int[] arr2 = {1, 2, 3};
        change2(arr2);
        System.out.println(arr2[0]);
    }

    public static void change(int[] arr){
        System.out.println("arr[1] =" + arr[1]);
        arr[1] = 222;
        System.out.println("arr[1] =" + arr[1]);
    }
    public static void change2(int[] arr){
        arr = new int[5];
        arr[0] = 999;

    }
}
