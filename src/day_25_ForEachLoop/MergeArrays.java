package day_25_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4},
                arr2={5,6};
        int[] arr3= new int[arr1.length+arr2.length]; // making sure that arr3 have enough capacity to contain
           //{0,0,0,0,0,0}
        int j=0; // for the index number of third array
        for (int i = 0; i <arr1.length ; i++) { //for arr1
          arr3[j++]= arr1[i]; //retrives each elements from arr1 and assigns to arr3
        }
        for (int i = 0; i <arr2.length ; i++) { // for arr2
            arr3[j++]= arr2[i];//retrives each elements from arr2 and assigns to arr3
        }
        System.out.println(Arrays.toString(arr3));













    }
}
