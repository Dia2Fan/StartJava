package edu.java.oop;

public class Tire {
    private String maker;
    private String position;

    public Tire(String maker, String position) {
        this.maker = maker;
        this.position = position;
    }

    public void attachTire(){
        System.out.println("장착되었습니다.");
    }

}
