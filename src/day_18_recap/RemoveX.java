package day_18_recap;

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word");
        String word=scan.next();
        if (word.toLowerCase().startsWith("x")) {
            System.out.println(word.substring( 1));
        }else {
            System.out.println(word);
        }
    }
}
