package day_09_If_Statements;

public class MaximumNumber2 {
    public static void main(String[] args) {
        int x=55,y=25;
        if (x>y){
            System.out.println(x+" is maximum number");
        }else if (y>x){
            System.out.println(y+ " is maximum number");
        }else {
            System.out.println("both equal ");
        }
    }
}
