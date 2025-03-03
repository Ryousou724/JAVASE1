package com.geekaca.test.list;

import java.util.ArrayList;

public class TestMovie {
    public static void main(String[] args) {
        /**
         * 自定义电影类 封装电影的信息
         *
         *JavaBean
         * 电影名 主演 年份 评分
         *
         * 创建三个电影对象，设置属性值
         * 定义一个集合ArrayList<Movie>,把这三个电影对象放入集合
         * 循环访问集合，打印每个电影的信息
         */
        Movie mv1 = new Movie();
        mv1.setName("肖申克的救赎");
        mv1.setActor("摩根弗里曼");
        mv1.setYear(1999);
        mv1.setScore(9.8);

        Movie mv2 = new Movie("霸王别姬", "张国荣", 1999, 9.8);
        Movie mv3 = new Movie("阿甘正传", "汤姆汉克斯", 1999, 9.8);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(mv1);
        movieList.add(mv2);
        movieList.add(mv3);
        for (int i = 0; i < movieList.size(); i++) {
            Movie movie = movieList.get(i);
            System.out.println(movie);
        }

    }
}
