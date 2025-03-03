package com.geekaca.test;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        /**
         * ArrayList集合框架
         */
        testModify();
    }
    //修改 删除
    public static void testModify(){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jack");
        myList.add("Jerry");

//        String remove = myList.remove(0);
//        System.out.println("删除了索引0:" + remove);
//        System.out.println("--------删除后-------");
//        System.out.println(myList);

        System.out.println("----------修改----------");
        String setted = myList.set(1, "欢迎");
        System.out.println(myList);
    }
    //泛型
    public static void testGeneric(){
        //泛型约束
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Tom");

        //包装类  是int对应的引用类型
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(99);


    }

    public static void test(){
        ArrayList list = new ArrayList();
        //放入集合
        list.add("你好");
        list.add("999");
        list.add("Tom");
        int size = list.size();
        System.out.println("集合的大小：" + size);
        //从集合取出 索引从0开始 到 list.size（） - 1
//        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            //把元素放入集合，就失去了原本的类型 java.lang.Object
            String s = (String)list.get(i);
            System.out.println(s);
        }
        //把Cat元素插入到原本索引0的前面
        list.add(0,"Cat");
        System.out.println(list);
    }
}
