package day_19_Loop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int min= 214743648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            int n =scan.nextInt();
            if (n<min){
                min=n;
            }

        }

        System.out.println("min = " + min);

    }
}
