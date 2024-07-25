package edu.java.oop;

public class OverLoading {
    //원주율 값으로 3.14로 초기화하는 상수 PI;
    private static final double PI = 3.14;
    private String type;

    //

    public OverLoading(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "종류 : "+type + ", 원주율 : "+ PI;
    }
    public void area(){
        System.out.println("넓이 구하기");
    }
    public void area(int length){
        System.out.println("넓이는 "+length*length+"입니다.");
    }

    public double area(double radius){
            System.out.println();
        return radius*radius*PI;
    }
    public double area(int length, int height){
        System.out.println();
        return length*height/2.0;
    }
    public static int sumAll(int x,int y){
        return x+y;
    }

    public static int sumAll(int[] numbers){
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }
        return sum;
    }
}
