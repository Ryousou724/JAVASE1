package d6;

import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        /**
         * 生成5位验证码
         */
        String code = generateCode();
        System.out.println(code);
    }
    public static String generateCode(){
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C',
                'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z'};
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            //从数组中随即取一个索引值，范围：0 ～ char.length - 1
            int index = random.nextInt(chars.length);
            char ch = chars[index];
            code += ch;
        }
        return code;
    }

}
