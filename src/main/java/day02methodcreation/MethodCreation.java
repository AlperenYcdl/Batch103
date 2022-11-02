package day02methodcreation;

public class MethodCreation {

    //main method icinde kullanacaginiz her sey static olmalidir
    public static void main(String[] args) {


        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ilkIkiyiToplUcuncuIleCarp(2, 8, 3.2));


        //sout yazip enter yapilicinca System.out.println otomatik yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var

    }
        //Example 1: Toplama islemi yapan bir method olustrunuz.
          public static double toplamaYap ( double a, double b){
            return a + b;

        }
        //Example 2: üc sayiyi birbiri ile carpan method olusturunuz.
        public static double ucSayiyiCarp ( double a, double b, double c){
            return a * b * c;
        }
        //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup,sonucu ekrana yazdiriniz
        public static double ilkIkiyiToplUcuncuIleCarp ( double a, double b, double c){
            return (a + b) * c;


        }


    }

