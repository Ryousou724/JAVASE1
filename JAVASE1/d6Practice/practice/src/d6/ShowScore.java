package d6;

import java.util.Scanner;

public class ShowScore {
    public static void main(String[] args) {
        /**
         * 评委打分
         * 方法：
         * input：int[] 评委的打分
         * output：double：最终得分
         */
        int[] allScores = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入一个评委的打分： (当前第)" + (i + 1) + "个");
            int inputScore = scanner.nextInt();
            allScores[i] = inputScore;
        }

//        int[] allScores = {50, 70, 80, 90, 99, 95};
        double score = calculateScore(allScores);
        System.out.println("最终得分：" + score);
    }

    public static double calculateScore(int[] score) {
        /**
         * 1，找到最大¥高分最低分，max min
         * 2，计算平均分
         * 2，1 求总分： （总分-max-min）/（评委人数-2）
         */
        int max = score[0];
        int min = score[0];
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            total += score[i];
        }
        System.out.println("去掉一个最高分" + max);
        System.out.println("去掉一个最低分" + min);
        double finalScore = (total - max - min) * 1.0 / (score.length - 2);
        return finalScore;
    }
}
