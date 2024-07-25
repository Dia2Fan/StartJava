package edu.java.oop;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp deskLamp = new DeskLamp(110);
        System.out.println(deskLamp);
        deskLamp.powerOn();
        System.out.println(deskLamp);
        deskLamp.setBrightness(3);
        System.out.println(deskLamp);
        deskLamp.powerOff();

    }
}
