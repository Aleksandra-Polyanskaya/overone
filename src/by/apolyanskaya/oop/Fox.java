package by.apolyanskaya.oop;

public class Fox extends Animals{

    public Fox(String sort, String name, int age, String color) {
        super(sort, name, age, color);
    }

    @Override
    void print() {
        super.print();
    }

    @Override
    public void say() {
        System.out.println("Звук: хррр");
    }
}
