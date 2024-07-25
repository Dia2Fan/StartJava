package edu.java.oop.excerise;

public class PersonMain {
    public static void main(String[] args) {
        Person kim = new Person(args[0], args[1]);

        Person lee = new Person();
        lee.setName("이땡땡");
        lee.setPhoneNumber("010-3456-5678");
        kim.personInfo();
        lee.personInfo();
    }
}
