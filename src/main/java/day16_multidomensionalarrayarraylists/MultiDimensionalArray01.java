package day16_multidomensionalarrayarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    /*
    Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
    Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz,
    "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
     */


    public static void main(String[] args) {

        //Example 1: Bir tane integer multidimensionl array olusturunuz
        // Bu arraydeki tum sayilarin toplamini veren code u yaziniz

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[] w : arr) {

            for (int k : w) {

                sum = sum + k;
            }
        }
        System.out.println(sum);


        //Example 2: Bir multidimensional array i normal array e ceviren code u yaziniz.
        //{{2, 5, 1},{32, 75}} ==> {2, 5, 1, 32, 75}


        //1.Multidimensional arraydeki eleman sayisini bulun.
        //Cunku yeni bir Array olusturmaliyiz ve bu yeni array in uzunlugu orjinal array in eleman sayisina esit olmalidir.
        int brr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int toplam = 0;//eleman sayilarini toplamak icin oluturuldu.

        for (int[] w : brr) {
            toplam = toplam + w.length;//Bu kod eleman sayisini getiricek , 9.
        }
        System.out.println(toplam);

        int idx = 0;

        int crr[] = new int[toplam];//kac eleman varsa toplama yerine gelir. 5. [0, 0, 0, 0, 0] int icin java default deger koyar.

        for (int[] w : brr) {//[2,5,1] , [32, 75]]

            for (int k : w) {//k:[2,5,1]

                crr[idx] = k;

                idx++;//
            }
        }
        System.out.println(Arrays.toString(crr));













    }





}
