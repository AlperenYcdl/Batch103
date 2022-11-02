package day18arrayListspassbyvalue;

public class Varargs01 {

        /*
        1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz varargs kullanmalisiniz

        2)Varargs arka tarafta "arry" kullanir,bu yuzden "varargs" larla calisirken "Array"lerle calisiyormus gibi davranabilirsiniz.
        3)"Varargs" olusturmak icin "<data type>...  <varargs ismi>" VEYA "<data type>  ...<varargs ismi>"
        4)Bir method da "varargs" in yaninda baska bir parametre kullanilabilir mi?
         -"varargs" en sonda olmak sarti ile kullanilir
        5)Bir method da birden fazla varargs kullanilablirmi?
        -"varargs" en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az biri en sonda olmayacaktir.Bu da 4.kural ile celisir

         Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez.
        cunku imzaya bakar.

        */

    public static void main(String[] args) {

        int r1 = toplama(2, 3);
        System.out.println(r1);

        int r2 = toplama(2, 3, 4 );
        System.out.println(r2);


        int r3 = toplama(2, 3, 4 ,5 ,6 ,7 ,8 ,9 );
        System.out.println(r3);
    }
    //    ///iki sayinin toplamini return eden bir method olusturunuz..
    //    public static int toplama(int a, int b ){
    //       return a+b;
    //    }
    //    ///uc sayinin toplamini return eden bir method olusturunuz..
    //    public static int toplama(int a, int b, int c ){
    //        return a+b+c;
    //    }
    //    ///dort sayinin toplamini return eden bir method olusturunuz..
    //        public static int toplama(int a, int b, int c, int d ){
    //        return a+b+c+d;
    //    }
    //
    //    //// Istedimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
    //    // ...a  varargs denir... varargs in arkasina array calisir...

    public static int toplama(int...a){

        int sum = 0;
        for (int w : a ) {
            sum = sum+w;
        }
        return sum;
    }

}
