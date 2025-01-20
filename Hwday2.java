package com.ryousou;

public class Hwday2 {
    public static void main(String[] args) {
        //身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如
        //下:
        //儿子身高(厘米)=(父亲身高+母亲身高) ×1.08÷2 女儿身高(厘米)=(父亲身高×0.923+母亲身高) ÷2
        //现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少?
        double fatherHeight = 177;
        double motherHeight = 165;
        System.out.println("儿子的身高是" + (fatherHeight + motherHeight) * 1.08 /2);
        System.out.println("女儿的身高是" + (fatherHeight * 0.923 + motherHeight) / 2);

        //红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
        // 绿茶妹妹有24元钱，她攒了几 天钱之后自己的钱正好是原来的两倍。
        // 那么红茶和绿茶现在的钱一样多，请问对么?
        int redmoney = 21;
        int greenmoney = 24;
        redmoney = redmoney * 2 + 3;
        greenmoney = greenmoney* 2;
        System.out.println("红茶妹妹攒了" + redmoney + "绿茶妹妹攒了" + greenmoney);
        System.out.println(redmoney == greenmoney);
    }
}
