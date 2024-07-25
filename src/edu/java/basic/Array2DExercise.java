package edu.java.basic;

public class Array2DExercise {
    public static void main(String[] args) {
        int[] student1 = {100,95,98};
        int[] student2 = {27,48,22};
        int[] student3 = {69,77,80};
        int[][] scores = {student1, student2, student3};
        int languageSum = 0;
        int englishSum = 0;
        int mathSum = 0;
        for (int i = 0; i < scores.length; i++) {
            languageSum += scores[i][0];
            englishSum += scores[i][1];
            mathSum += scores[i][2];
        }
        System.out.println("번호\t국어   \t영어   \t수학   \t총점\t평균");
        System.out.println("---------------------------------------");
        for (int i = 0; i <scores.length; i++) {
            System.out.print((i+1)+"번\t");
            int sum = 0;
            for (int j = 0; j <scores[i].length; j++) {
                System.out.print(scores[i][j]+"   \t");
                sum+=scores[i][j];

            }
            double average = (double) sum / scores[i].length;
            System.out.print(sum+"\t"+ String.format("%.2f",average));
            System.out.println();
        }
        System.out.println("---------------------------------------");
        System.out.println("총점\t"+languageSum+"   \t"+ englishSum +"   \t"+ mathSum);
        System.out.println("평균\t"+String.format("%.2f",languageSum/3.00)+"\t"+ String.format("%.2f",englishSum/3.00)+"\t"+String.format("%.2f",mathSum/3.00) +"\t");

    }
}
