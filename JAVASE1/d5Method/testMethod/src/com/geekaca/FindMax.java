package com.geekaca;

public class FindMax {
    public static void main(String[] args) {
        /**
         * 找数组的最大值
         */
        int[] faces = {20000, 10, 100, -90, 40000};
        int max = findMax(faces);
        System.out.println("颜值最高的是" + max);
    }

    /**
     *求数组最大值
     * @param arr int数组
     * @return 返回数组中的最大值
     */
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
