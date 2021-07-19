package day_07_Shorthand_Relational;

public class ShorthandOperators {

    public static void main(String[] args) {
        String n1 = "Muhtar", n2 = "Mehmet";
        String n3 = n2; //n3="Mehmet"
        n2 = n1;  //Muhtar
        n1 = n2;  //Muhtar
        n1 = n3;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("--------------------------------------------------------------");

        // addition
        int balance = 300;
        balance += 200;
        System.out.println("balance = " + balance);
        balance += 1000;
        System.out.println("balance = " + balance);

        //Withdraw
        balance -= 300;
        System.out.println("balance = " + balance);


        System.out.println("--------------------------------------------------------------");
        // divide and multiply
        int salary = 100000;
        salary *= 1.5;
        salary *= 0.65;
        System.out.println("salary = " + salary);
        int slices = 10;
        slices /= 2;
        System.out.println("slices = " + slices);
        System.out.println("--------------------------------------------------------------");
        //%=
        int cents=105;//===> 4quarters 5 cents
        int quarters=cents/25;
        cents%=25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("--------------------------------------------------------------");



        String name = "John";
        String lastname = "Josh";
        name += " ";
        name += lastname;
        System.out.println("name = " + name);














    }

}
