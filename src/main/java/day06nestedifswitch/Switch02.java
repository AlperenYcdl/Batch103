package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
            Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz
         */

        //Note: toLowerCase() methodu bir string`deki tum character leri kucuk harfe cevirir.
        //      toUpperCase methodu bir string deki tum character leri kucuk harfe cevirir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini yapiniz...");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi) {

            case "ocak":
                System.out.println("ocak");
            case "Subat":
                System.out.println("Subat");
            case "Mart":
                System.out.println("Mart");
            case "Nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "Agustos":
                System.out.println("Agustos");
            case "Eylul":
                System.out.println("Eylul");
            case "Ekim":
                System.out.println("Ekim");
            case "Kasim":
                System.out.println("Kasim");
            case "Aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz");


        }


    }


}
