package day_19_Loop;

public class Reverse {
    public static void main(String[] args) {
        String name = "Bilguun";
                     //0123456

        String reverseName="";

        for (int i = name.length()-1; i>=0  ; i--) {
        reverseName += name.charAt(i);

        }
        System.out.print(reverseName);
    }
}
