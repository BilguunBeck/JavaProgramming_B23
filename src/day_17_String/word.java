package day_17_String;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();
        boolean endsWithLY=word.endsWith("ly");
        if (endsWithLY){
            System.out.println("really?");
        }else {
            System.out.println("NVM");
        }
    }
}
