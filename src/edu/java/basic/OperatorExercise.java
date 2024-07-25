package edu.java.basic;

public class OperatorExercise {
    public static void main(String[] args) {
        System.out.println("------------PIZZA MENU------------");
        System.out.println("       medium size : 10000원");
        System.out.println("       Large  size : 20000원");
        System.out.println("----------------------------------");
        //가성비 피자 주문
        double medium = 20 * 20 * 3.14;
        double large = 40 * 40 * 3.14;
        System.out.println("미디엄 피자 2판 면적 : "+medium*2);
        System.out.println("라지 피자 1판 면적 : "+large);
        String check = (medium/10000>large/20000) ? "미디엄이 가성비":"라지가 가성비";
        System.out.println(check);
    }
}
