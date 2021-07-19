package day_06_UnaryOperatore;

import java.text.DecimalFormat;

public class Primetive_Casting {
    public static void main(String[] args) {
        double a =10.0;
        int f = (int)(long)a;

        long n= 100;
        int m= (int)n;

        int o=700000;
        short h= (short) o;
        System.out.println("h = " + h);
        System.out.println((int)1000.2525);
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.println( df.format(1.55525665));


    }
}
