package edu.java.oop;

public class ElectricCar {
    private int battery;
    private Tire frontL,frontR,rearL,rearR;
    private Tire[] tires;

    public ElectricCar(int battery,Tire ... tires) {
        this.battery=battery;
        this.tires = tires;
    }
}
