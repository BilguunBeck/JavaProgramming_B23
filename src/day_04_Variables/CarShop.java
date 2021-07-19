package day_04_Variables;

public class CarShop {
    public static void main(String[] args) {
        String brand= "Toyota",
                model= "Camry",
                color= "Black";
        int year=2020,
                miles= 45000;
               double price= 25000;
               long mng= (long) (2850 *price);

        System.out.println(year+" "+brand+" "+model+" "+color+" "+miles+"miles"+" "+"$"+price+" (Mongolian Tugruk) "+mng);
int dollar=115;
double mnt=dollar * 2847.873;
        System.out.println(dollar+" dollars equal to "+mnt+" mongolian tugruk");

int a=10,b=20;
int addition= a+b, substraction=a-b;

        System.out.println(a+" + "+b+" = " +addition);
        System.out.println(a+" - "+b+" = " +substraction);
        System.out.println("addition = " + addition);


        String name= "My name is Bilguun Borkhartsaga";
        String favoriteBook="my favorite book is Secret";
        String favoriteTvShow= "my favorite tv show is \"Friends\"";
        double tall=6.1;
        System.out.println(name+", "+favoriteBook+", "+favoriteTvShow+" my heitgh is "+tall+" ft");


        String day= "Tuesday";
        String todaysClass ="selinium";

        System.out.println("Today is "+day+" today we are taking "+ todaysClass);

        String R1= "SDET";
        String R2 = "Java";
        System.out.println("Today's word of the day is: "+ R1);
        System.out.println("Today's word of the day is: "+ R2);

    }


}
