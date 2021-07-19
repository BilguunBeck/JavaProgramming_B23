package day_14_Recap;

import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = scan.nextLine(); // IPhone12 Enter

        System.out.println("Enter the price");
        double price = scan.nextDouble(); //850

        System.out.println("Enter quantity");
        int quantity = scan.nextInt(); //5

        double totalPrice = price * quantity;

        scan.nextLine(); //Enter Enter

        System.out.println("Enter Full name");
        String firstName = scan.nextLine();

        System.out.println(firstName + " you're order for " + quantity + productName + " has been placed . You're total is $ " + totalPrice);





    }
}
