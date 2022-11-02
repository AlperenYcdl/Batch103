package day04ifstatement;

import java.util.Scanner;
import java.util.SortedMap;

public class Scanner01 {

    public static void main(String[] args) {

        //Kullanicidan ilk ismini, orta ismini, soyismini ve tc Kimlik numarasini aliniz,ve asagidaki formatta yazdirin.
        //Ali mert can
        //1234567
        Scanner input = new Scanner(System.in);


        /*

       //1.Yol;
        System.out.println("Lutfen ilk isminizi giriniz");
        String ilkIsim = input.next();

        System.out.println("lutfen orta isminizi giriniz");
        String ortaIsim = input.next();

        System.out.println("Lutfen soy isminizi giriniz");
        String soyIsim = input.next();

        System.out.println("Lutfen Tc kimlik numaranizi giriniz");
        String tcKimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim );
        System.out.println(tcKimlikNo);


        //2.Yol;
        System.out.println("Ilk,orta ve soyisminizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy= input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy );
        System.out.println(kimlik);
          Ali
          mert
          can
          1234567

        next() ile nextLine() arasindaki fark nedir?
        next() methodu kullanicidan gelen String`in ilk kelimesini alir
        nextLine() methodu kullanicidan gelen String`in tamamini alir.

        */

        //3.Yol;
        System.out.println("ilk,orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);

        //Windows icin ==> ctrl + /










    }
}
