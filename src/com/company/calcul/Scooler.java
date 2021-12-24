package com.company.calcul;

public class Scooler implements Person{

    String name;
    int age;

    public Scooler(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void goToTheScool() {
        System.out.println("Школьник: " + name + ". Возраст: " + age);
    }

    @Override
    public void getMark() {

    }
}
