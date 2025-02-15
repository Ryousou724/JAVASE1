package com.geekaca;

public class ChaxunArr {
    public static void main(String[] args) {
        /**
         * homework 从数组中查询制定元素的索引
         */
        int[] arr = {11, 22, 33, 44, 55};
        int num = length(arr, 33);
        System.out.println("元素的索引是" + num);
    }
    public static int length(int[] arr, int length){
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == length){
                return i;
            }
        }
        return -1;
    }
}
