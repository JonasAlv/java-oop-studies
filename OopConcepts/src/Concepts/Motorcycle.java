package Concepts;

public class Motorcycle extends Vehicle {

    @Override
    public void start() {
//        checkFuel();
//        checkGear();
        System.out.println("start Motorcycle");
    }

    private void checkFuel() {
        System.out.println("checkFuel");
    }

    private void checkGear() {
        System.out.println("checkGear");
    }
}
