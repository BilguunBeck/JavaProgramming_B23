package day_13_Scanner2;

import java.util.Scanner;

public class DisavantageForNextLine {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Job title");
        String jobTitle= scan.nextLine();
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("age = " + age);


    }

}
