package com.company.calcul;

public class Main {
    public static void main(String[] args) {
//        Calc calc = new Calc();
//        calc.operations(4, 5, '*');

        Person ivan = new Student("Иван", 21);
        ivan.goToTheScool();
        Person dima = new Scooler("Дима", 14);
        dima.goToTheScool();
    }
}
