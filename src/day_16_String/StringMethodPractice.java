package day_16_String;

import java.util.Scanner;

public class StringMethodPractice {
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        System.out.println("Enter 2 words");
        String w1= scan.nextLine();
        String w2= scan.nextLine();
        w1= w1.substring(1);
        w2=w2.substring(1);
        System.out.println(w1+w2);
        scan.close();



        /* Ask user to enter two words. Print first word without its first character
         then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

         */
    }
}
