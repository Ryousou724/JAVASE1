package com.geekaca.d4;

public class Arraymaxmin {
    public static void main(String[] args) {
        int[] arr = {15, 9000, 10000, 20000, 9500, -5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最大值" + max);
        System.out.println("最小值" + min);

    }
}
