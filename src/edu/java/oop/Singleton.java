package edu.java.oop;


//single pattern
//하나의 프로그램에서 인스턴스가 하나만 존재해야하는 경우 사용
public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }else{
            return singleton;
        }
    }

}
