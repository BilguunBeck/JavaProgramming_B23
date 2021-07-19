package day_17_String;

import java.util.Scanner;

public class initial2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName=scan.nextLine();

        String firstName=fullName.substring(0, fullName.lastIndexOf(" "));
        String lastName= fullName.substring(fullName.indexOf(" ")+1 );
        String initial= firstName.substring(0,1).toUpperCase()+ "."+lastName.substring(0,1).toUpperCase();
        System.out.println("initial = " + initial);
        scan.close();







    }
}
