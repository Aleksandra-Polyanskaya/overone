package by.apolyanskaya.oop;

public class Sheep extends Animals{

    public Sheep(String sort, String name, int age, String color) {
        super(sort, name, age, color);
    }

    @Override
    void print() {
        super.print();
    }

    @Override
    public void say() {
        System.out.println("Звук бе-бе-бе");
    }
}
