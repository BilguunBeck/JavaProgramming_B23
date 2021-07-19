package day_13_Scanner2;

import java.util.Scanner;

public class ShippingRequarment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter building number");
        int buildingNum = scan.nextInt();

        scan.nextLine();// to clear the scanner:Enter
        // we will use it if nextLine is place after other method
        System.out.println("Enter street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter state: ");
        String state = scan.next();

        System.out.println("Enter zip code");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter full name");
        String fullName= scan.nextLine();

        String shippingInfo= fullName+"\n"+buildingNum+" "+streetAddress+"\n"+cityName+" "+state+" "+zipCode;
        System.out.println("shippingInfo = " + shippingInfo);

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNum = " + buildingNum);
        System.out.println("streetAddress = " + streetAddress);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);



    }

}
/*ShippingInfo
    ask the followings:
        1. Builder Number (nextInt)
        2. Street Address (nextLine)
        3. City Name  (nextLine)
        4. State ( next )
        5. Zip Code (next)
        6. Full Name

    print the shipping info of the person

    Ex:
        Aysu Ahmadil
        7925 Jones Branch Drive
        Mclean, VA 22012

 */