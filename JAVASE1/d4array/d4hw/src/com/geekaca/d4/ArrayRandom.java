package com.geekaca.d4;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] arr ={22, 33, 35, 13, 88};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
