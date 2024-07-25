package edu.java.basic;

public class Array2D {
    public static void main(String[] args) {
        char[][] grades = new char[2][];//가변 2차 배열
        grades[0]= new char[2];
        grades[1]= new char[4];
        grades[0][0] = 'H';
        grades[0][1] = 'i';
        grades[1][0] = 'J';
        grades[1][1] = 'A';
        grades[1][2] = 'V';
        grades[1][3] = 'A';
        for (char[] grade : grades) {
            for (char c : grade) {
                System.out.print(c);
            }
            System.out.print(" ");
        }
        ///users 배열값 for
        int[][] users = new int[2][3];
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                System.out.println(users[i][j]);
            }
        }


        ///users 배열값 forEach
        for (int[] user : users) {
            for (int i : user) {
                System.out.println(i);
            }
        }
    }
}
