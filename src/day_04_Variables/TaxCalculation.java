package day_04_Variables;

public class TaxCalculation {
    public static void main(String[] args) {
    int salary = 120000;
    double stateTax = 0.08;
    double fedTax = 0.21;


        double totalStateTax = salary * stateTax;
        double totalFedtax = salary * fedTax;
        double salaryAfterTax=salary-totalFedtax-totalStateTax;
        System.out.println("You're salary is " + salary);
        System.out.println("You need to pay $" + totalStateTax + " of state tax");
        System.out.println("You need to pay $"+totalFedtax+" of federal tax");
        System.out.println("You're after tax salary is $"+salaryAfterTax);

    }
}