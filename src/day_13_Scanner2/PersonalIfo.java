package day_13_Scanner2;

import java.util.Scanner;

public class PersonalIfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter salary");
        int salary = scan.nextInt();

        System.out.println("Enter gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter full name");
        String fullName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);

    }
}
