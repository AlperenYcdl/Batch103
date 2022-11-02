package day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //MultiDimensionalArray kisa yoldan nasil olusturulur?
        char arr[][] = { {'a', 'b'}, {'C', 'D', 'E'}, {'?'} };
        System.out.println(Arrays.deepToString(arr));// [ [a, b], [C, D, E], [?] ]

        //Example: Bir String multidimensional array'de icinde "a" olan elemanlari console'a yazdiriniz.
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        for(String[] w : brr){
            //[ "is", "easy" ]
            // [ "learn", "java", "it" ]
            for(String k : w){
                if(k.contains("a")){
                    System.out.print(k + " ");
                }

            }
        }
    }
}

