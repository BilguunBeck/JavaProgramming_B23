package day_16_String;

public class WebName {
    public static void main(String[] args) {
        String url= "www.Amazon.com";
        String name= url.substring(url.indexOf(".")+1, url.lastIndexOf("."));
        System.out.println(name);
    }
}
