package Concepts;

public class Car extends Vehicle {

    @Override
    public void start() {
        checkFuel();
        checkGear();
        System.out.println("Car start");
    }

    private void checkFuel() {
        System.out.println("Check fuel");
    }

    private void checkGear() {
        System.out.println("Check gear");
    }
}
