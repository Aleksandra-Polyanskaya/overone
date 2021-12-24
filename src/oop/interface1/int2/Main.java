package oop.interface1.int2;

public class Main {
    public static void main(String[] args) {
        rideAndBrake Car = new Car("машина");
        Car.ride();
        Car.brake();

        rideAndBrake bicycle = new Bicycle("велосипед");
        bicycle.ride();
        bicycle.brake();

        rideAndBrake motorcycle = new Motorcycle("мотоцикл");
        motorcycle.ride();
        motorcycle.brake();

        rideAndBrake moped = new Moped("мопед");
        moped.ride();
        moped.brake();

        rideAndBrake bus = new Bus("автобус");
        bus.ride();
        bus.brake();

        rideAndBrake subway = new Subway("метро");
        subway.ride();
        subway.brake();

        rideAndBrake train = new Train("поезд");
        train.ride();
        train.brake();

        rideAndBrake tramway = new Tramway("трамвай");
        tramway.ride();
        tramway.brake();



    }
}
