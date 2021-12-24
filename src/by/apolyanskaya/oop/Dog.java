package by.apolyanskaya.oop;

public class Dog extends Animals{

    public Dog(String sort, String name, int age, String color) {
        super(sort, name, age, color);
    }

    @Override
    public void say() {
        System.out.println("Звук: гав");
    }

    @Override
    void print() {
        super.print();

    }
}
