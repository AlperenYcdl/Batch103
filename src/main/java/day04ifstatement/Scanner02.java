package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

   /*
        Not: char variable lari matematiksel islemlerde kullanirsaniz , Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println(`A` + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java da "+" sembolunun iki anlami vardir. i)Toplama islemi    ii)Birlestirme islemi
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir , o da olmazsa hata verir.


    */

    public static void main(String[] args) {

        //Kullanicidan ilk ve soy ismini aliniz , ilk ve soy isminin ilk harflerini ekrana yazdiriniz.
        //      Ali Can ==>AC

        Scanner input = new Scanner(System.in);

        //1.Yol
       /* System.out.println("Lufen ilk isminizi giriniz...");
        char ilkI = input.next().charAt(0);//A


        System.out.println("Lutfen soy isminizi giriniz...");
        char soyI = input.next().charAt(0);//C

        //System.out.println(ilkI + soyI); olursa 132 yazdirir
        System.out.println("" + ilkI + soyI);
        */

        //2.Yol
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();// Ali Can
        char ilkHarf = tamIsim.charAt(0);

        System.out.print(ilkHarf);//AC
        //System.out.println(ilkHarf); olursa alt alta A   C yazar. ln kaldirilirsa yan yana yazar.

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);













    }


}
