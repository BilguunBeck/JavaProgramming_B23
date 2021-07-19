package day_10_If_Statements;

public class TernaryPractice {
    public static void main(String[] args) {


        int num = 100;

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("result = " + result);
        System.out.println("--------------------------------------------------------------");

    }
}
