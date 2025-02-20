package d6;

import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        System.out.println("原数组是：");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
        String arrStr = Arrays.toString(arr);
        System.out.println(arrStr);
        System.out.println();
        arrCase(arr);
    }
    public static void arrCase(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("复制后的数组是：");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + "\t");
//        }
        String arr2Str = Arrays.toString(arr2);
        System.out.println(arr2Str);
    }
}
