package com.java.bean;

/**
 * @anthor longway
 * @create 2022-04-11
 * 14:23
 */
public class Student {
    private int number;
    private int age;
    private String name;

    public Student() {
    }

    public Student(int number) {
        this.number = number;
    }

    public Student(int number, int age) {
        this.number = number;
        this.age = age;
    }

    public Student(int number, int age, String name) {
        this.number = number;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
