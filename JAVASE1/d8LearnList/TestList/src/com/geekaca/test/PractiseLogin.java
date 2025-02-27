package com.geekaca.test;

import java.util.Scanner;

public class PractiseLogin {
    public static void main(String[] args) {
        String userName = "admin";
        String userPassword = "123456";
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("请输入用户名：");
            String inputName = scanner.next();
            System.out.println("请输入密码：");
            String inputPassword = scanner.next();

            if (userName.equals(inputName) && userPassword.equals(inputPassword)) {
                System.out.println("登陆成功！");
                break;
            } else {
                System.out.println("用户名或密码错误，请重新输入！");
            }
            if (i == 2) {
                System.out.println("三次登陆失败，账号锁定！");
            }
        }
    }
}
