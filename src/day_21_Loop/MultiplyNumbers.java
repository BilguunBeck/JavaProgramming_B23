package day_21_Loop;

public class MultiplyNumbers {
    public static void main(String[] args) {
        int a = 10,
                b= 3;


        int result = 0;

        for(int i = 0; i < b; i++){
            result += a;
        }

        System.out.println("result = " + result);



    }
}
/*
1. write a program that can multiply two positive numbers without using * operator
 */