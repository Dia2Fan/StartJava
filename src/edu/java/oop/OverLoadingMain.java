package edu.java.oop;

public class OverLoadingMain {
    public static void main(String[] args) {
        OverLoading saa = new OverLoading("정사각형");
        saa.area(4);

        OverLoading won = new OverLoading("won");
        System.out.println("won의 넓이는 " + won.area(5.0));

        OverLoading sam = new OverLoading("sam");
        System.out.println("sam의 넓이는 " + sam.area(5, 5));

        int i = OverLoading.sumAll(1, 2);
        

    }
}
