package com.geekaca.oop;

/** OOP
 * Object Oriented Programming
 * 面向对象编程
 * Java 面向对象的编程语言
 */
public class Hello {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.color = "红色";
        System.out.println("我的手机颜色：" + myPhone.color);

        Phone yourPhone = new Phone();
        yourPhone.color = "蓝色";
        System.out.println("你的手机颜色：" + yourPhone.color);

        System.out.println("--------------------");
        Car yourCar = new Car();
        yourCar.name = "保时捷";
        yourCar.price = 900000;
        yourCar.star();

        Car myCar = new Car();
        myCar.name = "比亚迪";
        myCar.price = 99800;
        myCar.star();

        System.out.println("--------不同类型变量作为类成员变量的默认值--------");
        showDefaultValue();
    }
    public static void showDefaultValue(){
        Phone phone = new Phone();
        System.out.println("color(String)" + phone.color);
        System.out.println("price(double)" + phone.price);
        System.out.println("weight(int)" + phone.weight);
        System.out.println("isBroken(boolean)" + phone.isBroken);
    }

}
