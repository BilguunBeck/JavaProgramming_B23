package day_19_Loop;
public class RemoveDuplicate {
    public static void main(String[] args) {
        String word="abababababab";
        String result= " ";
        for (int i = 0; i <word.length() ; i++) {
            if(!result.contains(""+word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }

}