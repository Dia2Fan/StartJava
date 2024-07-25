package edu.java.oop;

public class Pizza {
    int radius;
    String name;

    public Pizza(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public static Pizza getLargePizza(Pizza p1,Pizza p2){
        return p2.radius > p1.radius ? p2:p1;
    }

    public static void makeLargePizza(Pizza p1,int radius){
        if(p1.radius<20) p1.radius = radius;
    }
    public void changeRadius(int radius){
        this.radius = radius;
    }
    public static void printPizza(Pizza[] pizzas){
        System.out.println("------PIZZA ORDER LIST--------");
        System.out.println("no. \t피자 이름 \t 크기");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println((i+1)+"\t    "+pizzas[i].name+"\t      "+pizzas[i].radius);
        }
        System.out.println("-------------------------------");
        System.out.println("총 주문 수량 : "+pizzas.length);
    }
}
