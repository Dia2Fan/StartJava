package edu.java.oop;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.price = 5000;
        car.sunroof = false;
        car.color = "yellow";
        car.setMaker("KIA");
        System.out.println(car);
//        car.maker : private로 선언된 필드는 클래스 외부에서 접근 불가
        //

        Car bluecar = new Car();
        bluecar.price = 10000;
        bluecar.sunroof = false;
        bluecar.color = "Blue";
        bluecar.setMaker("HYUNDAI");
        System.out.println(bluecar);

        Car GreenCar = new Car("Green", false, 1000, "르노");
        System.out.println("GreenCar = " + GreenCar);
    }
}
