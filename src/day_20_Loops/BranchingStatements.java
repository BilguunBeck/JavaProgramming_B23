package day_20_Loops;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i <11 ; i++) {
            if (i%5==0){
                continue;

            }
            System.out.println(i+"");
        }

        System.out.println("-------------------------------------------------------------------------");
        for (char i = 'A'; i <='Z' ; i++) {
         if (i=='D'|| i=='T'|| i=='X' ){
             continue;
         }
            System.out.print(i+" ");
        }


















    }

}
