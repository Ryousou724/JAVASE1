package com.liangshuang;

import java.util.Scanner;

public class Hwday22 {
    public static void main(String[] args) {
        //1.键盘录入考试成绩，根据成绩区间，打印不同奖励机制
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = scanner.nextInt();
        if (score >= 95 && score <= 100) {
            System.out.println("奖励自行车");
        } else if (score >= 90 && score <= 94) {
            System.out.println("奖励旋转木马玩具");
        } else if (score >= 80 && score <= 89) {
            System.out.println("奖励大黄蜂玩具");
        } else {
            System.out.println("挨打");
        }






    }
}