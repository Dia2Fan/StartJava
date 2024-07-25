package edu.java.lang;

public class ThreadMain {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("지금 실행중인 쓰레드 이름 : "+t.getName());
    }
}
