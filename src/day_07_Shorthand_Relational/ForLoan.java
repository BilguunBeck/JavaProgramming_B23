package day_07_Shorthand_Relational;

public class ForLoan {
    public static void main(String[] args) {
        //LOAN income +60k, at least 2 years work history, credit score+700 Age+18,
String name="Bilguun";
        int income=100_000;
        int workYear=3;
        int creditScore=750;
        int Age=24;
        Boolean canGetLoan= income>=60_000 && workYear>=2 && creditScore>=+700 && Age>= 18;
        System.out.println(name+ " can get loan = " + canGetLoan);
    }
}
