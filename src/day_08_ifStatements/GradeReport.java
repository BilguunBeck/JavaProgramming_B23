package day_08_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;
        String name = "Bilguun";
        if (score >= 90 && score <= 100) {
            System.out.println("A FOR ACE!");
        }
        if (score >= 80 && score < 90) {
            System.out.println("B FOR BAD ASS!");
        }
        if (score>=70 && score<80){
            System.out.println("C mehhh");
        }
        if (score>=60 && score<70){
            System.out.println("D for Do better");
        }
        if (score<60){
            System.out.println("F for fucked");
        }




    }
}
