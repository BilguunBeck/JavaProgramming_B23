package day_12_Scanner;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width");
       int width = scan.nextInt();
        System.out.println("Enter length");
       int length =scan.nextInt();
       int area= width*length;
       int perimeter= (width+length)*2;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
