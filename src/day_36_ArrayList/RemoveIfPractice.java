package day_36_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractice {
    public static void main(String[] args) {
        ArrayList<Integer> scores= new ArrayList<>();
        scores.addAll(Arrays.asList(100,50,45,75,98,81,85,6,65,57,76));
        ArrayList<Integer>gradeOfA= new ArrayList<>(scores);//90-100
        gradeOfA.removeIf(p-> p<90);
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer>gradeOfB= new ArrayList<>(scores);
        gradeOfB.removeIf(p-> (p<80 || p>=89));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer>gradeOfC= new ArrayList<>(scores);
        gradeOfC.removeIf(p-> (p<70 || p>=79));
        System.out.println("gradeOfC = " + gradeOfC);

    }
}
