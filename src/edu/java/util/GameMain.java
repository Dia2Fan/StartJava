package edu.java.util;

import java.util.Scanner;

public class GameMain {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GameMain gm = new GameMain();
        gm.menu();

    }

    private void menu() {
        while(true){
            System.out.println("JAVA GAME CENTER");
            System.out.println("1. 가위 바위 보 \n"+"2. 야구 게임 \n"+"3. 게임 종료");
            System.out.print("선택 : ");
            int select = sc.nextInt();
            switch (select){
                case 1 -> RSP();
                case 2 -> playBaseball();
                case 3 -> System.exit(0);
                default -> System.out.println("잘못된 선택입니다");
            }
        }
    }


    public void RSP(){
        System.out.println("바위(0), 가위(1), 보(2)");
        int mySelect = sc.nextInt();
        if(mySelect>2||mySelect<0){
            System.out.println("숫자를 다시 선택해주세요");
            RSP();
            return;
        }
        int comSelect = (int)(Math.random()*2);
        switch (mySelect){
            case 0 -> {
                if(comSelect==0){
                    System.out.println("비겼습니다");
                }else if(comSelect==1){
                    System.out.println("이겼습니다");
                }else{
                    System.out.println("졌습니다");
                }
            }
            case 1 -> {
                if(comSelect==1){
                    System.out.println("비겼습니다");
                }else if(comSelect==2){
                    System.out.println("이겼습니다");
                }else{
                    System.out.println("졌습니다");
                }
                ;
            }
            case 2 -> {
                if(comSelect==2){
                    System.out.println("비겼습니다");
                }else if(comSelect==0){
                    System.out.println("이겼습니다");
                }else{
                    System.out.println("졌습니다");
                }

            }
        }

    }
    private void playBaseball() {
        System.out.println("구현중입니다. 다른 게임을 선택해주세요");
    }
}
