package day_08_ifStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 13;
        String name = "Bilguun";
        String citizen = "MGL";
        Boolean Eligible = age >= 21 && citizen == "MGL";
        if (Eligible) {
            System.out.println(name + " Can vote");
        }

        if (!Eligible) {
                System.out.println(name + " Can't vote");
            }
    }
}
