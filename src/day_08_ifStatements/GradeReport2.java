package day_08_ifStatements;

public class GradeReport2 {
    public static void main(String[] args) {
        int score= 95;
        boolean madeA =score>=90 && score<=100;
        boolean madeB=!madeA && score>=80;
        boolean madeC= !madeA && !madeB && score>=70;
        boolean madeD= !madeA && !madeB && !madeC && score>=60;
        boolean madeF= !madeA && !madeB && !madeC && !madeD && score<60;

        if(madeA){
            System.out.println("A");
        }
        if (madeB){
            System.out.println("B");
        }
        if (madeC){
            System.out.println("C");
        }
        if (madeD){
            System.out.println("D");
        }
        if (madeF){
            System.out.println("F");
        }
    }


}
