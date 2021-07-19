package day_09_If_Statements;

public class PosNegZero {
    public static void main(String[] args) {
        int num = 1525;
        if (num > 0) {
            System.out.println(num + " is Positive number");
        } else if (num < 0) {
            System.out.println(num + " is Negative number");
        } else {
            System.out.println(num + " is Zero");
        }
    }
}
