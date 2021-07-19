package day_12_Scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day");
        int day = input.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("thur");
        } else if (day == 5) {
            System.out.println("fri");
        } else if (day == 6) {
            System.out.println("sat");
        } else if (day == 7) {
            System.out.println("sun");
        } else {
            System.out.println("invalid");


        }
    }
}
