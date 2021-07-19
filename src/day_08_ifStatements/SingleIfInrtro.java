package day_08_ifStatements;

public class SingleIfInrtro {

    public static void main(String[] args) {

        int score= 60;
        boolean passed = score >= 60;
        boolean failed = !passed;
        if (passed) {
            System.out.println("You passed!");
        }
        if (failed) {
            System.out.println("You failed!");
        }

    }

}
