package day_13_Scanner2;
import java.util.Scanner;
public class MilesToKm {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter miles");
            double miles = scan.nextDouble();
            double km = miles * 1.609;

            System.out.println(miles+" miles equal to "+km+" kilometers");



        }

    }
