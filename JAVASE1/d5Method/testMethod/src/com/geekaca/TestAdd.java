package com.geekaca;

public class TestAdd {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
