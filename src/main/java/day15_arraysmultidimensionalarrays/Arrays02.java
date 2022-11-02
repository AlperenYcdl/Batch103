package day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1:Size verilen pozitif ve negatif sayilar iceren bir integer array'deki
        //"en buyuk negatif" ve "en kucuk poztif" elemani bulunuz.

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr); //Kucukten buyuge dizer

        System.out.println(Arrays.toString(arr));//[-12, -5, -2, 0, 18, 23]

        int maxNegative = arr[0];
        int minPositive = arr[arr.length - 1];//Pozitif olursa en sagda olacagi icin ,-1 kullanildi.

        for (int w : arr) {  //14. satirdaki sayilar sirayla,w yerine teker teker gider.
            if (w < 0) {
                maxNegative = Math.max(maxNegative, w);
            }
            if (w > 0) {
                minPositive = Math.min(minPositive, w);
            }
        }
        System.out.println(maxNegative + " and " + minPositive);//loop un disina gelmek zorunda. 3 durum negatif ,pozitif,....
    }
}
