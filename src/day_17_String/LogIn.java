package day_17_String;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        String correctUsername = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();

        System.out.println("Enter your password:");
        String password = scan.next();

        boolean canLogIn = username.equalsIgnoreCase(correctUsername) && password.equals(correctPassword);

        if (canLogIn) {
            System.out.println("Logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }


        scan.close();


    }
}
