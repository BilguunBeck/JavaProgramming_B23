package day_20_Loops;

public class CatAndDog {
    public static void main(String[] args) {
        String sentence = "Cat Dog Dog Cat";
        int numOfCat=0;
        int numOfDog=0;
        for (int i = 0; i <= sentence.length()-3 ; i++) { // i:0,1,2,3...14
          String each=  sentence.substring(i,i+3);
          if (each.equalsIgnoreCase("cat")){
              numOfCat++;

          }
          if (each.equalsIgnoreCase("dog")){
              numOfDog++;
          }

        }
        System.out.println("number of Dog = " + numOfDog);
        System.out.println("number of Cat = " + numOfCat);
        boolean equal= numOfCat==numOfDog;
        System.out.println("equal = " + equal);
    }

}
