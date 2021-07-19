package day_19_Loop;

public class ForLoopsEven {
    public static void main(String[] args) {
        for (int i = 1; i <101 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        String odds= "";
        String evens= "";
        System.out.println();
        for (int i = 1; i <101 ; i++) {
            if (i % 2 != 0) {
                odds += i + "";
            } else {
                evens = i + "";
            }
        }
            System.out.println("evens = " + evens);
            System.out.println("odds = " + odds);
        }
    }


