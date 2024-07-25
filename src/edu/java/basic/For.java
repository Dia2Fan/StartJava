package edu.java.basic;

public class For {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
        for (int i = 2; i <= 10; i = i + 2) {

            System.out.println(i);

        }

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += i;
        }

        System.out.println(sum);
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 * " + i + " 는 " + 2 * i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        char alphabet = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(alphabet);
                alphabet += 1;

            }
            System.out.println();
        }
        //버전1
        for (int i = 2; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        //버전2
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("ㅁ");
            }
            System.out.println();
        }
        String[] users = new String[3];
        users[0]="moo";
        users[1]="soo";
        users[2]="too";
        for (int i = 0; i <users.length; i++) {
            System.out.println(users[i]);
        }
        int kim =99,Lee=88,Han=77,ahn=66,ben=55;
        int[]students = {kim,Lee,Han,ahn,ben};
        int[] userA = {99,88,77,66,55};
        int sumA=0 ;
        for (int i = 0; i < userA.length ; i++) {
            sumA+=userA[i];
        }
        double aveA = (double)sumA / userA.length;
    }
}
