package com.liangshuang;

import java.util.Random;
import java.util.Scanner;

public class Hwday3Guessnum {
    public static void main(String[] args) {

        Random random = new Random();
        int correct = random.nextInt(100) + 1;
        System.out.println("欢迎参加猜数字游戏，我生成了一个1-100的数字");
        Scanner scanner = new Scanner(System.in);

        int numoftime = 5;
        while(numoftime > 0) {
            System.out.println("请输入你的猜测, 你还剩余" + numoftime + "次机会");
            int num = scanner.nextInt();
            numoftime--;

            if(num == correct){
                System.out.println("恭喜猜对了数字");
                break;
            }else if(num > correct){
                System.out.println("数字猜大了");
            }else{
                System.out.println("数字猜小了");
            }
            if(numoftime == 0){
                System.out.println("很遗憾，正确的数字是" + correct);
            }
        }
    }
}

