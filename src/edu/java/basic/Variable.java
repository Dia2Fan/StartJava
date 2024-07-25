package edu.java.basic;

public class Variable {
    public static void main(String[] args) {
        //primitive data type
        int a=1,b=2,c=3;
        int number = 10;
        System.out.println("number = " + number);
        long bigNumber = 1000000000L;
        System.out.println("bigNumber = " + bigNumber);
        String name = "John";
        System.out.println("name = " + name);
        float decimalF = 3.14141414141414f;//정밀도가 6자리
        System.out.println("decimalF = " + decimalF);
        double decimalD = 3.14141414141414;
        System.out.println("decimalD = " + decimalD);
        boolean isTrue = true;
        System.out.println("isTrue = " + isTrue);
        char character = 'A';

        String Name = "Lee";
        int kor = 90, eng = 80, com = 75;
        System.out.println("이름 = " + Name);
        System.out.println("과목   점수");
        System.out.println("국어 = " + kor);
        System.out.println("영어 = " + eng);
        System.out.println("컴터 = " + com);
        int sum = kor + eng + com;
        System.out.println("sum = " + sum);
        double average = (double)sum / 3;
//        double average = sum / 3.0;
        System.out.println("ave = " + average);



    }
}
