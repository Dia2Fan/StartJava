package edu.java.oop.excerise;


//이름과 전화번호를 저장하는 클래스
//
public class Person {
    private String name;
    private String phoneNumber;

    public  Person(){

    }

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void personInfo(){
        System.out.println("-------연락처 정보---------");
        System.out.println("이름 : " + this.name+ "\n" +"전화번호 : " + this.phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
