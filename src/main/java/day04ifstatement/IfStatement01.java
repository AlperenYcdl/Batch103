package day04ifstatement;

import java.security.KeyStore;

public class IfStatement01 {


    public static void main(String[] args) {
        // if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar
        // if it rains, I will cancel the picnic.
        // Sart      ,  sonuc
        // true      ,    Active
        // false     ,    Deactive


        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
        int s = 12;

        if(s>0) {
            System.out.println("Positive");
        }

        //Example 2: Verilen karakter buyuk harf ise ekrana buyuk harf yazdirin
        char ch = 'V';

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");

        }

        /*
            && islemi sadece boolean ile kullanilir
               true &&  true = true
               true &&  false= false
               false&&  true = false
               false && false =false
            && islemi mukemmeliyetcidir , true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.

         */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "uc basamakli" yazdiriniz.
        int n = -2430;
        n = Math.abs(n); // absoulut methodu negatifi yok edip pozitife cevirir.
        if (n>999 && n<1000){ //n>=100 && n<=999 veya n>999 && n<1000
            System.out.println("Uc basamakli");
        }


        //Example 4: Verilen bir sayi cift sayi ise ekrana cift yazdirin.
        int p = 17;

        //"=" isareti atama operotedir, matematikteki esittir anlamina gelmez
        //Matematikteki esittir sembolu Java'da "==" seklindedir.
        //2+3 == 5

        if (p%2==0) {
            System.out.println("Cift sayi");

        }

        //Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana harika sayi yazdirin.

        short f = 250;

        if (f<300 || f>1200);
        System.out.println("Harika sayi");
       /*
            || islemi sadece boolean ile kullanilir.
            true || true = true
            true || false= true
            false || true= true
            false || false= false
            Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter.
       */

        }



    }


