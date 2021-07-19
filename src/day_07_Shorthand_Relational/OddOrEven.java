package day_07_Shorthand_Relational;

public class OddOrEven {
    public static void main(String[] args) {
        int num=15;
        boolean even=num%2==0;
        boolean odd= even==false; //or odd=number% !=0
        System.out.println("15 is odd = " + odd);
        System.out.println("15 is even = " + even);
    }
}
