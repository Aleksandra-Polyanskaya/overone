package by.apolyanskaya.oop;

public class Bear extends Animals{

    public Bear(String sort, String name, int age, String color) {
        super(sort, name, age, color);
    }

    @Override
    void print() {
        super.print();
    }

    @Override
    public void say() {
        System.out.println("Звук р-р-р-р");
    }
}
