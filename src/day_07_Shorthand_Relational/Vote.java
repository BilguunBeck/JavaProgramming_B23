package day_07_Shorthand_Relational;

public class Vote {
    public static void main(String[] args) {
        String name="Ujin";
        String citizen="USA";

        int age=19;
        Boolean canVote = age >=18  &&  citizen=="USA";
        System.out.println(name +" is can vote "+canVote);







    }
}
