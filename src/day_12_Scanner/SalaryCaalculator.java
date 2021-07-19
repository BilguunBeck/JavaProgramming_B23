package day_12_Scanner;

import java.util.Scanner;

public class SalaryCaalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter hourly rate");
       double hourlyRate= scan.nextDouble();
        System.out.println("Work hours in week");
        double weeklyHours= scan.nextDouble();
        System.out.println("Working weeks in year");
        double weeks= scan.nextDouble();

                double salary=hourlyRate*weeklyHours*weeks;
                double TaxToPay=salary*0.1;
                double earningAfterTax= salary-TaxToPay;
        System.out.println("You're salary is " + salary+" $");
        System.out.println("You'reTax to pay is " + TaxToPay+" $");
        System.out.println("You're earnings after tax is " + earningAfterTax+" $");

       }
    }

