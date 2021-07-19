package day_07_Shorthand_Relational;

public class Hundred {
    public static void main(String[] args) {
        int num=100;
        boolean numIsPos=num>=0;
        boolean numIsNeg=num<0;
        boolean numIsZero= num==0;
        System.out.println("100 is positive number: " + numIsPos);
        System.out.println("100 is negative number: " + numIsNeg);
        System.out.println("100 is equal to 0: " + numIsZero);

    }
}
