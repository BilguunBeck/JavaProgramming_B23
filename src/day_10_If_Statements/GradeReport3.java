package day_10_If_Statements;

public class GradeReport3 {
    public static void main(String[] args) {
        int score = 99;
        String grade = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else if (score <= 59) {
                grade = "F";
            } else {
                grade = "Invalid";
            }
            System.out.println("grade = " + grade);
        }
    }
}