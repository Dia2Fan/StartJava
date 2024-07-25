package edu.java.basic;

public class Operator {
    public static void main(String[] args) {
        int time = 3695;
        int hour = time / 3600;
        int minute = (time % 3600) / 60;
        int second = time % 60;
        System.out.println("지금 시간은 " + hour + "시 " + minute + "분" + second+"초입니다");
        int year = 2024;
        int lastyear = --year;
        System.out.println("last year : "+lastyear);

        char check= '?';
        boolean lower;
        boolean upper;
        boolean alphabet;
        if(check>='A'&&check<='Z'){
            lower =false;
            upper=true;
            alphabet=true;
        }else if(check>='a'&&check<='z'){
            lower =true;
            upper=false;
            alphabet=true;
        }else{
            lower =false;
            upper=false;
            alphabet=false;
        }
        System.out.println("입력문자 = " + check);
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("alphabet = " + alphabet);

        int years = 2024;
        String yun = (years%4==0&&(years%100!=0||years%400!=0)) ? "윤년 O" : "윤년 X";
        System.out.println(yun);
    }
}
