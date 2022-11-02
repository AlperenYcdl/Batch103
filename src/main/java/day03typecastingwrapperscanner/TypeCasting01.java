package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //TypeCasting:Bir numeric data type`ini diger numeric data type`ina cevirmek demektir.
    //             byte < short < int < long < float < double

    //Not: kucukten buyuge cevirmeye "Auto widening" denir.(otomatik genisletme)
    // buyukten kucuge cevirmeye "Explicit Narrowing" denir.(Acikca daraltma)

    public static void main(String[] args) {

        byte age = 23;
        int newAge=age;


        long population=1234;
        int newPopulation= (int)population;


        //Example 1: short`u double´a ceviren kodu yaziniz.
        short numOfStudent= 235;
        double newNumOfStudent= numOfStudent; //Auto Widening.


        //Example 2:          float`i byte yapan kodu yaziniz.
        float price = 12.99f;
        byte newPrice= (byte)price;//Explicit Narrowing
        System.out.println(newPrice);//12 = Java ondalik sayiyi,tam sayiya cevirirken yuvarlama islemi yapmaz.
                                     //     Java ondalik sayiyi,tam sayiya cevirirken ondalik kismini siler.


        int number = 515;
        byte newNumber= (byte)number;
        System.out.println(newNumber);//3= Java 515 i 256(byte daki sayilarin sayisi) ya boldu kalani return etti..
                                                    //byte degerleri -128 ile 127 arasi; 256

        int num=510;
        byte newNum= (byte)num;
        System.out.println(newNum);//-2





    }

}
