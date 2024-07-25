package edu.java.collection;

class classA extends Thread{
    @Override
    public void run() {
        super.run();
    }
}
class classB implements Runnable{

    @Override
    public void run() {

    }
}
public class LamdaMain {
    public static void main(String[] args) {
        classA a = new classA();
        a.start();

        //4.classB에 오버라이딩 된 메서드를 스레드로 시작시키기
        new Thread(new classB()).start();

        classB classB = new classB();
        Thread t = new Thread(classB);
        t.start();

        //5. 참조변수가 있는 익명의 객체로 thread 구현
        Thread t3 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread t3");
            }
        };
        t3.start();
        //5. 참조변수가 없는 익명의 객체로 Runnable 구현
        new Thread(new Runnable(){
            @Override
            public void run() {

            }
        }).start();
        System.out.println("7. 람다식으로 runnable구현");
        new Thread(() -> System.out.println("Thread lamda")).start();

    }
}
