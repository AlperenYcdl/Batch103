package day13loopSarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {
        //Example 1 :kullanıcıdan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
        //           Aksi halde ekrana kaybettin yazdiriniz
        //           Kullanici kazandikca oyun devam etmeli


        Scanner input = new Scanner(System.in);
        int sayi = 0;
       /*
        do {
            System.out.println("Bir sayi giriniz...");
            sayi = input.nextInt();

            if (sayi < 100) {
                System.out.println("Kazandiniz!");
            }
        } while (sayi < 100);
        System.out.println("Kaybettiniz!");
        */


        //Example 2:Kullanıcıdan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz.

        do {
            System.out.println("Lufen isim giriniz...");
            char ilkHarf = input.next().charAt(0);
            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("Ismi basarili girdiniz.");
            } else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz sistem tarafinda iptal edildi");
                break;
            }
        }while(true);

    }

}

