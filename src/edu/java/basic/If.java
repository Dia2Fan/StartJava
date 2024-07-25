package edu.java.basic;

public class If {
    public static void main(String[] args) {
        int mise = 40;
        if (mise <= 50) {
            System.out.println("미세먼지 좋음");
        } else if (mise <= 100) {
            System.out.println("미세먼지 보통");
        } else if (mise <= 150) {
            System.out.println("미세먼지 나쁨");
        }

        double cm = 180.0;
        double kg = 85.0;
        double BMI = kg / (cm * cm / 10000);
        if (BMI < 18.5) {
            System.out.println("저체중");
        } else if (BMI < 24.9) {
            System.out.println("정상");
        } else if (BMI < 29.9) {
            System.out.println("과체중");
        } else if (BMI < 34.9) {
            System.out.println("비만");
        } else {
            System.out.println("고도비만");
        }
        String size = "medium";
        int price = 0;
        switch (size) {
            case "small":
                price = 10000;
                break;
            case "medium":
                price = 20000;
                break;
            case "large":
                price = 30000;
                break;
            default:
                System.out.println("피자 사이즈 선택 오류!!");
                return;
        }
        System.out.println(price);
        int year = 2024;
        int month = 2;
        int lastDate = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                lastDate = 31;
                break;
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
                    lastDate = 29;
                } else {
                    lastDate = 28;
                }
                break;
            default: lastDate = 30;
        }

        System.out.println(lastDate);
    }

}
