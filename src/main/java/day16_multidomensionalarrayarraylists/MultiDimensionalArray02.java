package day16_multidomensionalarrayarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        //Bir multidimensional arraydeki en buyuk ve en kucuk elemanin toplamini veren code u yazin
        int arr[][] = {{2, 5, 1}, {83, 75}};

        int maxElement = arr[0][0];
        int minElemenet = arr[0][0];

        for (int[] w : arr) {

            for (int k : w) {

                maxElement = Math.max(maxElement, k);//83
                minElemenet = Math.min(minElemenet, k);//2
            }
        }
        System.out.println(maxElement);//83
        System.out.println(minElemenet);//1

        System.out.println(maxElement+minElemenet);//84

    }
}
