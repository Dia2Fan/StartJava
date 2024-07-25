package edu.java.oop;

public class Initialization {
    int instanceField;
    static int staticField;
    {
        System.out.println("3. instance init block");
    }
    static {
        System.out.println("1.static init block");
    }

    public Initialization(){
        System.out.println("4.constructor block");
    }
    public static void main(String[] args) {
        System.out.println("2. main() start");
        Initialization initialization = new Initialization();
        System.out.println("5. main() end");
        staticField=5;
        System.out.println("staticField = " + staticField);
        initialization.instanceField = 5;
        System.out.println("initialization.instanceField = " + initialization.instanceField);

    }
}
