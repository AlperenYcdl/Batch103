package day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() Method: Bu method u kullanarak bir elemanin Array de olup olmadigini anlariz.
        //                       binarySearch() Methodunu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir..
        //                       binarySearch() Methodu aradiginiz eleman Array d varsa o elamanin indexini return eder.
        //                       binarySearch() method'u aradiginiz arrayde yoksa ?

        //                       binarySearch() Method u tekrarlayan elemanlar icin kullanilmaz.
        int arr[] = {12, 31, 43, 14};

        int sayi1 = 43;

        Arrays.sort(arr);//Kucukten buyuge dizer. [12,13,31,43] olur.

        int idx1 = Arrays.binarySearch(arr, sayi1);//43 sayisi ,3. ındex oldugu icin.
        System.out.println(idx1);

        //Ana code icine deger yazmamaya dikkat ederiz. bkz;
        //13.satirda int sayi=43/ 43 sayisini ,19. satirda sayi yerine yazilmaz.



        //Olmadigi zamanda olusan code;
        int sayi2 = 58;

        int sonuc = Arrays.binarySearch(arr, sayi2);

        System.out.println(sonuc);//-5
        //"-" gorunurse aranan eleman arryde yok demektir.
        // "5" sayi:Olsaydi hangi sirada olacagini gosteriyor.(indexi degil)









    }

}
