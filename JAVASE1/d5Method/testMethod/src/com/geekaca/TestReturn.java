package com.geekaca;

public class TestReturn {
    public static void main(String[] args) {
        /**
         * return单独使用
         */
       chu(9, 0);
    }
    public static void chu(int a, int b){
        if (b == 0){
            return;
        }
        System.out.println(a / b);

    }
}
