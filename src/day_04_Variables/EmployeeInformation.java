package day_04_Variables;

public class EmployeeInformation {
    public static void main(String[] args) {
        String firstName= "Bilguun";
        String lastName= "Borkhartsaga";
        String fullName= firstName +" "+ lastName;
        String gender = "Male";
        String age= "23";
        String companyName= "Apple";
        String jobTitle= "SDET";
        boolean isFulltime=true;
        boolean isMarried=true;
        int salary=100000;




        System.out.println(fullName);
        System.out.println("Employee full name"+" "+fullName);
        System.out.println(fullName);
        System.out.println(fullName+" "+"is"+" " +gender+" "+age+ ""+"years old");
        System.out.println(fullName+" works at "+companyName+" he's job titel is "+jobTitle);
        System.out.println(fullName+" is "+isFulltime);
        System.out.println(fullName+"'s salary is " +salary+"$");
        System.out.println(fullName+" is married "+isMarried);


        String word= "Java ";
        System.out.println("My favorite language is "+ word+ " programing language");
    }
}
