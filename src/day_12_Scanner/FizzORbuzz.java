package day_12_Scanner;

public class FizzORbuzz {
    public static void main(String[] args) {
        int num =3;
        String result=" ";
        switch (num){
            case 3:
            case 6:
            case 9:
               result=("Fizz");
                break;
            case 5:
            case 10:
                result=("Buzz");
                break;
            case 1:
                result=("ONE");
                break;
            case 2:
                result=("TWO");
                break;
            case 4:
                result=("FOUR");
                break;
            case 7:
                result=("SEVEN");
                break;
            default:
                result=("INVALID NUMBER");
                System.out.println(result);


        }
    }
}
