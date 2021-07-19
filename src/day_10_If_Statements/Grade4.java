package day_10_If_Statements;

public class Grade4 {
    public static void main(String[] args) {
        int grade=80;
        String result= (grade>=90 && grade<100) ? "A": (grade>=80)? "B" : (grade>=70)? "C":(grade>=60)?"D":"F";

        System.out.println("result = " + result);
    }
}
