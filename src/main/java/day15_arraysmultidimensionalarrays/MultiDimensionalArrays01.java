package day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {


    //Bir Array'in elemanlari Array ise bu Arrayler " Multidimensional " Array'dir.

    public static void main(String[] args) {

        //Multidimensional Arrays nasil olusturulur.

        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));// [[0, 0], [0, 0], [0, 0]]
        //Multidimensional arraylere eleman ekleme nasil yapilir?

        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][0] = 6;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        //Multidimensional Array console a nasil yazdirilir?
        System.out.println(Arrays.deepToString(arr)); // [[3, -4], [6, 18], [-7, 0]]

        //Multidimensional Array'lerde Array elemanlardan biri nasil yazdirilir?
        System.out.println(Arrays.toString(arr[1]));// [6, 18]

        //Multidimensional Array'lerde ic Arraylerdeki elemanlar nasil yazdirilir?
        System.out.println(arr[1][0]);//6s

        //Example 1: String bir Multidimensional Array olusturunuz.
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        //String bir Multidimensional Array olusturunuz
        String brr[][] = new String[4][3];
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        System.out.println(Arrays.deepToString(brr)); // [[A, B, C], [D, E, F], [G, H, I], [J, K, L]]

        int sum = 0;//Toplama yapilacagi zaman sum olsuturuldugu icin.

        for (String[] w : brr) { //Harfler birer birer w nin icine geliyor ve alttaki satira gidiyor.
            sum = sum + w.length; //0+3=3 / 3+3=6/ 6+3=9/ 9+3=12 her biri sum a eklenyiyor sirayla
        }
        System.out.println(sum);//12


    }
}
