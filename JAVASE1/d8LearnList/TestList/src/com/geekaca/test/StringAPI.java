package com.geekaca.test;

import java.util.Arrays;

public class StringAPI {
    public static void main(String[] args) {
        /**
         * 常用String API
         */
        testSubString();
//        testReplace();
        testSplit();

    }
    //分隔
    public static void testSplit(){
        String str = "Hello Java World";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        String str2 = "你好#世界#大海";
        String[] splitArr = str2.split("#");
        System.out.println(Arrays.toString(splitArr));

    }

    public static void testReplace(){
        String str = "你好Java";
        String str2 = str.replace("Java", "世界");
        System.out.println(str2);
    }

    public static void test() {
        String str = "Hello java";
        int len = str.length();
        // 长度是字符串中的字符个数
        System.out.println("长度：" + len);
        //索引index都是从零开始 最大索引length - 1
        char c = str.charAt(0);
        System.out.println("第一个字符(索引0):" + c);
        System.out.println("最后一个字符:" + str.charAt(str.length() - 1));
        System.out.println("----------打印字符串的每个字符-----------");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        String codes = "abcdefsd12346ABCDZ";
        System.out.println("--------字符数组----------");
        char[] charArray = codes.toCharArray();
        System.out.println(charArray.length);
    }

    public static void testSubString() {
        String str = "TestJava";
        //从头开始，结束索引1  包含0索引所在的元素，不包含1索引所在的元素
        //【startIndex，endIndex）
        String substring = str.substring(0, 1);
        System.out.println(substring);

        System.out.println(str.substring(0, 4));
        System.out.println("len：" + str.length());
        System.out.println(str.substring(4, 8));
        System.out.println("-------一个参数---------");
        System.out.println("从4取到末尾:" + str.substring(4));
    }
}
