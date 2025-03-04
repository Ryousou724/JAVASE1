package com.geekaca.test.stulist;

import java.util.ArrayList;

public class FindStudent {
    public static void main(String[] args) {
        Student st1 = new Student("20180302", "叶孤城", 23, "护理一班");
        Student st2 = new Student("20180303", "东方不败", 24, "推拿二班");
        Student st3 = new Student("20180304", "西门吹雪", 25, "中药四班");
        Student st4 = new Student("20180305", "叶超风", 26, "护理一班");

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(st1);
        stuList.add(st2);
        stuList.add(st3);
        stuList.add(st4);

        findStudents(stuList);

    }

    public static void findStudents(ArrayList<Student> stuList) {
        for (int i = 0; i < stuList.size(); i++) {
            Student student = stuList.get(i);
            if (student.getClassName().equals("护理一班")) {
                student.setAge(student.getAge() + 1);
                System.out.println("找到护理一班学生：" + student.getName());
                System.out.println("年龄加一之后是" + student.getAge() + "岁");
            }
        }
    }
}
