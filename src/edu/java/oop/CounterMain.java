package edu.java.oop;




class Counter{
    private static int number;
    private String instanceName;
    public Counter(String instanceName){
        this.instanceName=instanceName;
        number++;
        System.out.println("Counter : "+this.instanceName +", 객체 개수 : "+number);
    }

}
public class CounterMain {
    public static void main(String[] args) {
        Counter c1 = new Counter("c1");
        Counter c2 = new Counter("c2");
        new Counter("C");


    }

}
