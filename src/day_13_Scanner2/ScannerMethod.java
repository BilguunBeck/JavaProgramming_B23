package day_13_Scanner2;
import java.util.Scanner;
public class ScannerMethod {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("You are full time employee:");
            boolean isFullTime = scan.nextBoolean();

            System.out.println("You are an adult:");
            boolean isAdult = scan.nextBoolean();

            System.out.println("You are married:");
            boolean isMarried = scan.nextBoolean();

            System.out.println("isFullTime = " + isFullTime);
            System.out.println("isAdult = " + isAdult);
            System.out.println("isMarried = " + isMarried);





        }

    }

