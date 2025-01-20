package com.ryousou;

public class Hwday23 {
    public static void main(String[] args) {

        //2.键盘录入月份，用switch打印月份天数
        int M = 2;
        switch(M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("有30天");
                break;
            case 2:
                System.out.println("有28天");
                break;
        }
    }
}

