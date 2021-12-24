package by.apolyanskaya.oop;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("кот", "Пушок", 5, "серый");
        cat.print();
        cat.say();

        System.out.println();

        Dog dog = new Dog("собака", "Майк", 4, "рыжий");
        dog.print();
        dog.say();

        System.out.println();

        Bear bear = new Bear("медведь", "Мишка", 7, "коричневый");
        bear.print();
        bear.say();

        System.out.println();

        Fox fox = new Fox("лиса", "Лисичка", 4,"рыжая");
        fox.print();
        fox.say();

        System.out.println();

        Sheep sheep = new Sheep("овца", "Беляш", 2, "белый");
        sheep.print();
        sheep.say();
    }
}
