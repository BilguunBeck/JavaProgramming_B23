package day_08_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 10;

        boolean odd = num % 2 != 0;
        if (odd) {
            System.out.println("odd = " + odd);
        }
        if (!odd){
            System.out.println(num+ "even");
        }
    }
}