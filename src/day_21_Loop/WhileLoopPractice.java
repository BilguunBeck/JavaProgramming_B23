package day_21_Loop;

public class WhileLoopPractice {

    public static void main(String[] args) {
        String sentence= " Beck is good Beck is smart Beck is cool";
        //                      is good Beck is smart Beck is cool
        //                      is good      is smart Beck is cool
        //                      is good      is smart       is cool (No more Beck to count)

        int countBeck=0;
        while (sentence.toLowerCase().contains("Beck")){
            countBeck++;
            sentence=sentence.replaceFirst("Beck","");
        }
        System.out.println("countBeck = " + countBeck);
    }
}
