package day_17_String;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String gmail="bibilguun97@gmail.com";
        boolean isValidGmail=gmail.endsWith("@gmail.com");
        System.out.println("isValidGmail = " + isValidGmail);
    }
}
