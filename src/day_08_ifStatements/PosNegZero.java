package day_08_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int num =1524;
        boolean poss= num>0;
        boolean neg= num<0;
        boolean zero= !poss && !neg;
        if (poss){
            System.out.println( num+ " is positive number");
        }
        if (neg){
            System.out.println(num+" is negative number");
        }
        if (zero){
            System.out.println(num+" is zero");
        }




    }

}
