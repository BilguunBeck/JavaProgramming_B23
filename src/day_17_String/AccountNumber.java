package day_17_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNumber=scan.next();
        char firstChar=accountNumber.charAt(0);
        String result="";
        switch (firstChar){
            case '2':if (accountNumber.length()==7) {
                result=("Valid Account number");
            }else {
                result=("Invalid Account number should be 7 character long");
            }
        break;
            case '5':
              if (accountNumber.length()==10) {
                  result=("Valid Account");
              }else {
                  result=("Invalid Account number should be 10 character long");
              }
              break;
            default:
                result=("Invalid number account number should start with 2 or 523456");
                scan.close();
        /*if( account.length() == 7 || account.length() == 10){
            if(account.charAt(0)  == '2'&& account.length() ==7){ // if the first character is 2 && has 7 characters in total characters
                System.out.println("Valid Account");
            }else if(account.charAt(0)  == '5'&& account.length() ==10){ // if the first character is 2 && has 7 characters in total characters
                System.out.println("Valid Account");
            }else{
                System.out.println("Invalid Account");
            }
        }else{
            System.out.println("Invalid Account");
        }
                */

        }
    }
    /* 1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected
     results print “Invalid account number”

     */
}
