package Concepts;

public abstract class Vehicle {

    private String chassisNumber;

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public abstract void  start();

}
