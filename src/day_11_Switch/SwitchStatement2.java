package day_11_Switch;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String name="Opera";
        switch (name) {

            case "Chrome":
                System.out.println("Chrome selected");
                break;
            case "Opera":
                System.out.println("Opera selected");
                break;
            case "Firefox":
                System.out.println("Firefox selected");
                break;
            default:
                System.err.println("Invalid!");
        }

    }
}
