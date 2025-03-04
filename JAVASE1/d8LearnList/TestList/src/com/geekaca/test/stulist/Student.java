package com.geekaca.test.stulist;

/**
 * JavaBean
 */

public class Student {
    private String stuNO;
    private String name;
    private int age;
    private String className;

    public Student(String stuNO, String name, int age, String className) {
        this.stuNO = stuNO;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getStuNO() {
        return stuNO;
    }

    public void setStuNO(String stuNO) {
        this.stuNO = stuNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNO='" + stuNO + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}
