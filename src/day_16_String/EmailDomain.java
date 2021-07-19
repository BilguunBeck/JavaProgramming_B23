package day_16_String;

public class EmailDomain {
    public static void main(String[] args) {
String email="bibilguun97@gmail.com";
int beginnigIndex= email.indexOf("@")+1;
int endingIndex= email.indexOf(".");
String domain= email.substring(beginnigIndex,endingIndex);
        System.out.println("domain = " + domain);
    }
}
