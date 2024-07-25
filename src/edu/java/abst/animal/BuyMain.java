package edu.java.abst.animal;

public class BuyMain {
    public static void main(String[] args) {
        TV tv = new TV();
        Audio audio = new Audio();
        Monitor monitor = new Monitor();

        Buyer buyer = new Buyer();
        buyer.buy(tv);
        buyer.buy(monitor);
        buyer.buy(audio);
        
        Interface interLambda = () -> {
            System.out.println("인터페이스를 람다식으로 구현");
        };
        interLambda.method();
    }
    public interface Interface{

        void method();
    }
}
