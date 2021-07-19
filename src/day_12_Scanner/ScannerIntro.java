package day_12_Scanner;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1= input.nextInt();
        System.out.println("Enter 2nd number");
        int num2= input.nextInt();
        int addition= num1+ num2;
        int subtraction= num1- num2;
        int division = num1/ num2;
        int multipication = num1* num2;
        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("division = " + division);
        System.out.println("multipication = " + multipication);
    }
}
