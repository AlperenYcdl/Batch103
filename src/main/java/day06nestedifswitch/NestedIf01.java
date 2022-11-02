package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
            Password un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
            Password un ilk harfi kucuk harf ise
                'z' olursa gecerli password aksi halde gecersiz password
         */

        String pwd = "Axy12!";

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {

            if (pwd.charAt(0) >= 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }

        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) <= 'z') {
                ;
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");

            }

        }
    }
}