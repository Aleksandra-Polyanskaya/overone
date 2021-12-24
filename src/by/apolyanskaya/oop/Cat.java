package by.apolyanskaya.oop;

public class Cat extends Animals{

    public Cat(String sort, String name, int age, String colour) {

        super(sort, name, age, colour);
    }



    @Override
    public void say() {
        System.out.println("Звук мяу");

    }
}
