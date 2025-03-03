package com.geekaca.test;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class ListScores {
    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(98);
        scoreList.add(77);
        scoreList.add(66);
        scoreList.add(89);
        scoreList.add(79);
        scoreList.add(50);
        scoreList.add(100);
        System.out.println("原始元素：" + scoreList);
        for (int i = scoreList.size() - 1; i >= 0; i--) {
            if (scoreList.get(i) < 80) {
                scoreList.remove(i);
            }
        }
        System.out.println("删除后的元素：" + scoreList);

    }
}
