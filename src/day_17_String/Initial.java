package day_17_String;

import java.util.Locale;
import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName=scan.nextLine();
        System.out.println("Enter last name");
        String lastName=scan.nextLine();
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);

        /*String initial= firstName.substring(0,1).toUpperCase()+ "."+lastName.substring(0,1).toUpperCase();
        System.out.println("initial = " + initial);
        scan.close();

         */

    }
}
/* write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S

 */