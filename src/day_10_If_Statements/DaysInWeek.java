package day_10_If_Statements;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 18;  // 1 ~ 7
        String name = "";
        if (number >= 1 && number <= 7) {

            if (number == 1) {
                name = "Monday";
            } else if (number == 2) {
                name = "Tuesday";
            } else if (number == 3) {
                name = "Wednesday";
            } else if (number == 4) {
                name = "Thursday";
            } else if (number == 5) {
                name = "Friday";
            } else if (number == 6) {
                name = "Saturday";
            } else {
                name = "Sunday";
            }


        } else {
            name = "No such a day!";
            System.out.println("name = " + name);
        }
    }
}
