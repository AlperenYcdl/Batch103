package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data almaya yarar,Scanner kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Java Class`idir,bu Class`i kullnabilmek icin "import" etmek gerekir.
    //Scanner Class i Java nin util kutuphanesindendir


    public static void main(String[] args) {

        //Kullanicidan data almak icin yapilmasi gerekenler

        //1.Adim: Scanner Class`indan object olusturun

        //Class ismi,  obje isareti  =
        Scanner input = new Scanner(System.in);

        //2.Adim: Kullaniya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir...");

        //3.Adim: Kullanicidan aldiginiz datayi bir variable in icine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin " + age);

    }



}
