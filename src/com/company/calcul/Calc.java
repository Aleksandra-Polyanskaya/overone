package com.company.calcul;

public class Calc implements Calculator{

    @Override
    public double summa(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mult(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    public void operations (double a, double b, char ch){
        switch (ch){
            case '+'-> System.out.println(summa(a, b));
            case '-' -> System.out.println(sub(a, b));
            case '*' -> System.out.println(mult(a, b));
            case '/' -> System.out.println(div(a, b));
        }
    }
}
