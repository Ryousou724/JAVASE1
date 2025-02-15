package com.geekaca;

public class BijiaoArr {
    public static void main(String[] args) {
        /**
         * homework 利用方法比较数组是否相同
         */
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println(compare(arr1, arr2));
    }
    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}

