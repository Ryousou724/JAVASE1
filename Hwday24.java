package com.ryousou;

import java.util.Scanner;

public class Hwday24 {
    public static void main(String[] args) {
        //3.键盘录入一个数字N，求和1+...N

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入求和数字N");
        int input = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        System.out.println("求和结果是：" + sum);


    }
}
