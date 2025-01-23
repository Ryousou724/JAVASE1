package com.geekaca.d4;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组和为" + sum);
    }
}
