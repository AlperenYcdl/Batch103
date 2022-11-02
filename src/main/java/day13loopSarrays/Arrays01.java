package day13loopSarrays;

import java.util.Arrays;

public class Arrays01 {


        /*
        1)Ayni data typelarinda coklu data i depolamak icin Javanin olusturdugu yapilar vardir
          Bu yapilardan biriside Arrylerdir.
        */


    public static void main(String[] args) {

        //Arrays nasil olusturulur?
        int stdAges[] = new int[7]; // [ 0, 0, 0, 0, 0, 0, 0]

        //Arrays nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Arraylere nasil elemanlar eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]

        //Arraylere herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//10


        //Example 1:Arraydeki en kucuk ve en buyuk elemani ekrana yazdiriniz.

        //Kucukten buyuge siralama
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        //Ilk index icin
        int ilk = stdAges[0];

        //Son index icin
        //Note: "length()" Stringlerde kullanilir, "length" Arraylerde kullanilir.
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);//24


        //Example 2:stdAges Array i icerisindeki tum elemanlarin toplamini ekrana yazdiran kodu yazdiriniz.

        //1.Yol For-loop
        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {

            sum = sum + stdAges[i];
        }
        System.out.println(sum);//84

        //2.Yol:while-loop
        int i = 0;
        int toplam = 0;

        while (i < stdAges.length) {

            toplam = toplam + stdAges[i];

            i++;
        }
        System.out.println(toplam);

        //3.Yol: do-while-loop
        int k = 0;
        int s = 0;

        do {
            s = s + stdAges[k];
            k++;
        } while (k < stdAges.length);
        System.out.println(s);

        //4.Yol: for each loop Array'lerde ve Collections'larda kullanilir
        int t = 0;
        for (int w : stdAges) {
            t = t + w;
        }
        System.out.println(t);

        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterSayilariToplami = 0;

        for (String w : stdNames) {
            karakterSayilariToplami = karakterSayilariToplami + w.length();
        }
        System.out.println(karakterSayilariToplami);//18

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz

        char ch[] = {'A', 'c', 'D', 'k', 'M'};

        for (char w : ch) {
            if (w >= 'A' && w <= 'Z') {
                System.out.print(w);
            }
        }
    }
}