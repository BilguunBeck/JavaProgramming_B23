package day_13_Scanner2;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter you're job title");
        String jobTitle= scan.nextLine();
        System.out.println("jobTitle = " + jobTitle);
    }
}
