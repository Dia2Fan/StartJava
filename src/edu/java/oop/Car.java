package edu.java.oop;

//클래스
public class Car {
    //속성, 상태, property,field
    //public(+): 모두에게 공유,protected(#):패키지가 같은 경우+ 상속받은 클래스 공유,default(~):기본상태(패키지가 같은 경우),private(-):공유하지 않음(클래스 내부에서만)
    //생성자(클래스의 객체를 만들어줌)
    public String color;
    protected boolean sunroof;
    int price;
    private String maker;

    public Car(){
        System.out.println("자동차가 생성되었습니다.");
    }
    //따로 생성자를 선언하지 않는다면 자동으로 기본생성자를 만들어줌
    //

    public Car(String color, boolean sunroof, int price, String maker) {
        this();
        this.color = color;
        this.sunroof = sunroof;
        this.price = price;
        this.maker = maker;
    }

    //메서드(기능),동작, behavior, method
    public void start(){
        System.out.println("자동차가 출발합니다");
    }
    public void stop(){
        System.out.println("자동차가 멈춥니다");
    }
    public void drive(){

    }

    //객체를 문자열로 출력하는 메서드

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String toString(){
        return "Car 객체의 색상 -"+color+"썬루프 유무"+sunroof+"가격-"+price+"제조사-"+maker;
    }
}
