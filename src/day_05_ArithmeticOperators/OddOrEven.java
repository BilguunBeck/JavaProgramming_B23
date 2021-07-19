package day_05_ArithmeticOperators;

public class OddOrEven {

    public static void main(String[] args) {

        double num = 11.0;
        boolean isEven = num % 2 == 0;               //if the remainder of the number is /2 is equal to zero, the number is even.
        boolean isOdd = num % 2 > 0;

        System.out.println(num+ "is an even number:"+ isEven);
        System.out.println(num+"is an odd number:"+isOdd);


    }
}
