package Concepts;

public class Race {

    public static void main(String[] args) {

        Car car = new Car();
        car.setChassisNumber("123456");
        car.start();

        System.out.println("_".repeat(20));

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setChassisNumber("123456");
        motorcycle.start();

    }
}
