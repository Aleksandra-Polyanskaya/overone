package oop.interface1.int2;

public class Moped implements rideAndBrake{

    String view;

    public Moped(String view) {
        this.view = view;
    }

    @Override
    public void ride() {
        System.out.print("Это " + view + ". Может ездить.");
    }

    @Override
    public void brake() {
        System.out.println("Может тормозить.");

    }
}
