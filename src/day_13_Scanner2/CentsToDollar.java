package day_13_Scanner2;
import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainder = cents % 100;
        if (cents >= 0) {    // if the input is valid
            if (remainder == 0) {
                System.out.println(cents + "is equal to " + dollars + "dollars ");

            } else {
                System.out.println(cents + "is equal to " + dollars + "dollars and " + remainder + " cents");
            }
        }else {
            System.err.println("invalid input bruhhh");
        }
    }
}