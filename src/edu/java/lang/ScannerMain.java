package edu.java.lang;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) throws IOException {
        String url = "https://www.hanbit.co.kr/";
        URLConnection urlCon = new URL(url).openConnection();

        Scanner scanner = new Scanner(urlCon.getInputStream());

        scanner.useDelimiter("\\Z"); //문서의 끝

        String html = scanner.next();
        System.out.println(html.length());
        System.out.println(html);
        scanner.close();
        System.exit(0);
    }
}
