package edu.java.String;

public class StringMain {
    static String nullStr;
    static String emptyStr="";

    public static void main(String[] args) {
        System.out.println("l"+nullStr+"l");
        System.out.println("l"+emptyStr+"l");

        System.out.println(nullStr.toString());//new로 객체를 생성하지 않았음으로 null이라 nullPointerException 생김
        System.out.println(emptyStr.toString());
    }
}
