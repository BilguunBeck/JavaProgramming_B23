package day_07_Shorthand_Relational;

public class AmazonFreeShipping {

    public static void main(String[] args) {
        double price=18;
        boolean Pmember=false;
        boolean isEliglbeForFreeShipping= price>=25 || Pmember==true;
        System.out.println("isEliglbeForFreeShipping = " + isEliglbeForFreeShipping);

        int  number = 10;
        boolean isPos = number>0;
        boolean isNeg = number<0;
        boolean isEqualToZero = number ==0;
        System.out.println("isPos = " + isPos);
        System.out.println("isNeg = " + isNeg);
        System.out.println("isEqualToZero = " + isEqualToZero);
    }
}
