package day_17_String;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String url= "www.amazon.com";
        boolean isValidUrl= url.startsWith("www.")&& (url.endsWith(".com")||(url.endsWith(".edu")||(url.endsWith(".gov"))));
        System.out.println("isValidUrl = " + isValidUrl);
    }
}
