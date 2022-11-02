package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //kullanicidan yas degerini alan ve hangi evrede oldugunu
        // asagidaki tabloda oldugu gibi ekrana yazdirin.

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yasi giriniz");
        byte yas= input.nextByte();

        if (yas<0){
            System.out.println("Gecerli yas giriniz");
        }else if (yas<=4){
            System.out.println("Bebeksiniz msllh");
        } else if (yas<=12) {
            System.out.println("Cocuksunuz");
        } else if (yas<=20) {
            System.out.println("gencsiniz");
        } else if (yas<=30) {
            System.out.println("yetiskinsiniz");
        } else {
            System.out.println("Tanimlanmamis");

        }


    }
}
