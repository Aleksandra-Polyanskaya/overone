package com.company.calcul;

public class Student implements Person{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void goToTheScool() {
        System.out.println("Студент: " + name + ". Возраст:" + age + ".");
    }

    @Override
    public void getMark() {

    }
}
