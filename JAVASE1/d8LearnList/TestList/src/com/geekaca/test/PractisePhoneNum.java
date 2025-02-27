package com.geekaca.test;

import java.util.Scanner;

public class PractisePhoneNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String inputPhone = scanner.next();

        String maskPhoneNum1 = maskPhoneNum(inputPhone);
        System.out.println("屏蔽后手机号：" + maskPhoneNum1);

    }

    public static String maskPhoneNum(String phone) {
        if (phone == null || phone.length() != 11) {
            return "手机号格式错误";
        }
        return phone.substring(0, 3) + "****" + phone.substring(7, 11);
    }

}
