package day_22_Loop_Recap_Do_While_Loop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        String username = "cybertek";
        String password = "cybertek12345";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String u = scan.next(); // u: to store user entered username

        System.out.println("Enter password");
        String p = scan.next();//p: to store user entered password

        if (u.equals(username) && p.equals(password)) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i <= 3; i++) {
                System.out.println("User name or password incorrect, re-enter");

                System.out.println("Enter username");
                u = scan.next();

                System.out.println("Enter password");
                p = scan.next();

                if (u.equals(username) && p.equals(password)) {
                    System.out.println("Logged in");
                    break;
                }
                if (i==3) {
                    System.out.println("Your account is locked");
                    System.exit(0);
                }
            }
        }

        System.out.println("Howdy bitch!");
        scan.close();
    }
}
/*1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */