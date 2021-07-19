package day_10_If_Statements;

public class Finra {
    public static void main(String[] args) {
        int number = 15;
        String result = "";

        if(number%3==0 && number%5==0){
            result = "FINRA";
        } else if(number%5==0){
            result = "RA";
        }else if(number%3 ==0){
            result = "FIN";
        }else{
            result =   ""+number; // "15"
        }

        System.out.println("result = " + result);

    }
}
