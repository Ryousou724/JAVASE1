package com.geekaca;

public class TestOverload {
    public static void main(String[] args) {
        fire();
        fire("火星");
        fire("火星", 5);

    }
    public static void fire(){
        System.out.println("发射1个导弹");
    }
    public static void fire(String location){
        System.out.println("向" + location + "发射1个导弹");
    }
    public static void fire(String location, int num){
        System.out.println("向" + location + "发射" + num + "个导弹");
    }

}
