package day_15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first name");
        char f= scan.next().charAt(0);

        System.out.println("Enter last name");
        char l= scan.next().charAt(0);

        scan.close();


        /*String lastname= scan.next();
      char f= firstName.charAt(0);
      char l = lastname.charAt(0);
      */
      String initial=f+" . "+l;

        System.out.println("initial = " + initial);
    }
}
