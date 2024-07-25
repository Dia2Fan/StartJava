package edu.java.lang;

import java.util.Arrays;

public class MathLotto {
    public static void main(String[] args) {
        int[] lottoWin = {20, 3, 9, 6, 33 ,7};
        int bonusNumber = 10;
        boolean bonusYN = false;
        int[] lottoNum =new int[6];
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i]= (int)(Math.random()*45)+1;
            for (int j = 0; j < i; j++) {
                if(lottoNum[i]==lottoNum[j]){
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lottoNum);
        Arrays.sort(lottoWin);
        int i=0,j=0;
        int count = 0;
        while(i<lottoWin.length-1&&j<lottoNum.length-1){
            if(lottoWin[i]==lottoNum[j]){
                count++;
                i++;j++;
            }else if(lottoWin[i]<lottoNum[j]){
                i++;
            }else {j++;}
        }
        System.out.println(count);
    }
}
