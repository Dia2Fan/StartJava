package edu.java.basic;

public class While {
    public static void main(String[] args) {
        char yesNo = 'n';
        do{
            System.out.println(1);
            System.out.println(2);
            System.out.println(3+yesNo);
        }while(yesNo == 'y');

        System.out.println();
        int count = 1;
        while (count<=100){
            count++;

        }
        for (int i = 1; i <100; i++) {
            if(i%7!=0){continue;}
            System.out.print(i+" ");
        }
        for (int i = 1; i <100; i++) {
            if(i%7!=0){continue;} else if (i%3==0) {continue;

            }
            System.out.print(i+" ");
        }
        for (int i = 100; i > 0; i--) {
            if(i%7==0){
                System.out.println(i);
                break;
            }
        }
    }
}
