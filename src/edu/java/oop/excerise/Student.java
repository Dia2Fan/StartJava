package edu.java.oop.excerise;

public class Student extends Person{
    String studentNumber;

    public Student(String name,String studentNumber) {
        super.setName(name);
        this.studentNumber = studentNumber;
    }

    public Student(String name, String phoneNumber, String studentNumber) {
        super(name, phoneNumber);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public void personInfo(){
        System.out.println("-------연락처 정보---------");
        System.out.println("이름 : " + super.getName()+ "\n" +"전화번호 : " + super.getPhoneNumber()+", 학번 : "+studentNumber);
    }
}
