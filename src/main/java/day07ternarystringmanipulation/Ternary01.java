package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Bir sayinin pozitifmi olup olmadigini ekrana yazdiran kodu yazdiriniz.

        //1.Way: if-else

        int a = 0;
        if (a > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif degil");
        }

        //2.Way: Ternary
        //               Condition        ?               dogru ise kullanilicak kod      :             Condition Yanlis ise
        String sonuc =    a > 0           ?                      "Pozitif"                :               "Pozitif degil";
        System.out.println(sonuc);


        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz
        int b = 120;
        int c = 23;

        int min = b < c ? b : c;
        System.out.println(min);


        //Example 3:Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //      Pozitif sayilarin ve 0 in mutlak degeri kendileridir.
        //      Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

         int d = 0;
        int abs = d < 0 ? -1 * d : d;
        System.out.println(abs);

        //Exampel 4:Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "islem yapamam" mesaji veriniz.
        int e = 12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data type ini Obcejt yapiniz.
        Object islem = (e > 0 && f > 0) || (e < 0 && f < 0) ? e * f : "islem yapamam aslan,next";
        System.out.println(islem);

        //Note:Java da her class'in en az bir tane "parent" class'i vardir
        //      Sadece "Object" class'in "parent" class i yoktur.
    }
}
