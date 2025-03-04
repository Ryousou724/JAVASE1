package com.geekaca.test.stulist;

import java.util.ArrayList;

public class StudentSystem {
    public static void main(String[] args) {
        /**
         * 学生管理系统
         *
         * ArrayList<student>
         */
        Student st1 = new Student("20180302", "叶孤城", 23, "护理一班");
        Student st2 = new Student("20180303", "东方不败", 24, "推拿二班");
        Student st3 = new Student("20180304", "西门吹雪", 25, "中药四班");
        Student st4 = new Student("20180305", "叶超风", 26, "神经二班");

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(st1);
        stuList.add(st2);
        stuList.add(st3);
        stuList.add(st4);

        //定义方法 实现搜索
        String NO = "20180303";
        Student student = findByNO(stuList, NO);
        if (student != null) {
            System.out.println("找到了学号为：" + NO + " 详情：" + student);
        }else{
            System.out.println("没有找到学号为："+ NO + "的学生");
        }

        System.out.println("-----------根据名字模糊搜索-----------");
        findByName(stuList, "叶");


    }

    /**
     * 根据学号 搜索学生
     *
     * @param list  给定学生集合
     * @param stuNO 要搜索的学号
     * @return 符合对应学号的学生，找不到则返回null
     */
    public static Student findByNO(ArrayList<Student> list, String stuNO) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (stuNO.equals(student.getStuNO())) {
                return student;
            }
        }
        return null;
    }
    public static void findByName(ArrayList<Student>list, String name){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String stuName = student.getName();
            if (stuName.contains(name)){
                System.out.println("找到一个名字中含有：" + name + " 的学生：" + student);
            }

        }
    }
}
