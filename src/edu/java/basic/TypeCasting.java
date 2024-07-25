package edu.java.basic;

public class TypeCasting {
    public static void main(String[] args) {
        byte one = 1;
        byte two = 2;
        byte three =1+2;//값끼리는 ok
//        byte three2 = one+two;// 변수 연산은 X; int 자료형으로 자동변환되어 계산되기 때문에 byte변수에 저장 불가
        int oneMil = 1000000;
        int twoMil = 2000000;
        long threeMil = (long) oneMil * twoMil;
        System.out.println("threeMil = " + threeMil);
    }
}
