package day_15_String;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter number");
        double n1= scan.nextDouble();

        System.out.println("Enter math operator");
        char mathOperator= scan.next().charAt(0); // +, - , * , /

        System.out.println("Enter 2nd number");
        double n2= scan.nextDouble();

        double result= 0;

        switch (mathOperator){
            case '-':
                result= n1-n2;
                break;
            case '+':
                result= n1+n2;
                break;
            case '*':
                result= n1*n2;
                break;
            case '/':
                result=n1/n2;
                break;

            default:
                System.out.println("Invalid Operator!");
                scan.close();
            System.out.println("result = " + result);
        }
    }
}
