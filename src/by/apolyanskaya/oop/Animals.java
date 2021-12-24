package by.apolyanskaya.oop;

public abstract class Animals {

    String sort;
    String name;
    int age;
    String color;

    Animals (String sort, String name, int age, String color){

        this.sort = sort;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getSort(){ return sort;}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    void print(){
        System.out.println("Вид: " + getSort() + '\n' + "Имя: " + getName() + '\n'+ "Возраст: " + getAge() + '\n' + "Цвет: " + getColor());
    }

    public abstract void say();
}
