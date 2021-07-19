package day_12_Scanner;


import java.util.Scanner;

public class EligbileToBuyVodka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you're age");
        int age = input.nextInt();
        if(age>=21){
            System.out.println("Get some beer too!");
        }else {
            System.out.println("Get the F out of here kid!!!");
        }

    }
}
