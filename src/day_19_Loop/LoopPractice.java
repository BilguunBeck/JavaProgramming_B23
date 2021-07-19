package day_19_Loop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int num= scan.nextInt();
        int sum= 0;
        for (int i = 1; i <=num ; i++) {
            sum += i;

        }
        System.out.println("sum = " + sum);
    }
}
