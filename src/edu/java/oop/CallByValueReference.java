package edu.java.oop;

public class CallByValueReference {
    public static void main(String[] args) {
        int medium = 15;
        int large = 20;
        Pizza p1 = new Pizza(large, "감자 피자");
        Pizza p2 = new Pizza(medium, "새우 피자");
        Pizza p3 = new Pizza(large, "치즈 피자");
        Pizza[] pizzas = {p1,p2,p3};
        Pizza.printPizza(pizzas);
        Pizza largePizza = Pizza.getLargePizza(p1, p2);

    }
}
