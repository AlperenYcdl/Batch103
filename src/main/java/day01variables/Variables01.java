package day01variables;

public class Variables01 {

                                 //Variables nasil olusturulur?

    //1) Acces Modifier  2)Data Type  3)Variable ismi  4)=  5)Deger 6);

    //Java da ";" Ingilizcedeki "." gibidir.
    //Ingilizce de "cumle" deriz , Java´da "statement" deriz

    //"="sembolu "Assigment Operator"olarak adlandirilir.
    //"Assigment Operator" sagdaki degeri alir soldaki variable´in icine koyar

    public int age = 13;

    public int height = 183;

                                //Java´da Data Type´lari
    /*
                        Primitive Data Types (ilkel demek ama java da )
    1)int:Integer´ín kisaltmasi. Tam sayi demek. / 32 bit yani 4 byte kullanir.
          Matematik´te tam sayilarin basi ve sonu yoktur fakat Java´da tamsayilarin basi ve sonu vardir.
          En kucuk int= -2,147,483,648
          En buyuk int=  2,147,483,647

    2)byte: Tamsayilar icin kullanilir. / 8 bit yani 1 byte kullanir.
          En kucuk byte:-128
          En buyuk byte: 127

    3)short: Tamsayilar icin kullanilir. / 16 bit yani 2 byte kullanir.
          En kucuk short:-32768
          En buyuk short: 32767

    4)long:Tamsayilar icin kullanilir. 64 bit yani 8 byte kullanir.
          En kucuk long:-9000000000000000000
          En buyuk long: 9000000000000000000

     5)float: Ondalikli sayilar icindir. 32 bit yani 4 byte kullanir.
          "float" virgulden sonra 7 basamak icerebilir.
          "float" degerlerinde sona "f" veya "F" koymaniz gerekir.

     6)double: Ondalikli sayilar icindir. 64 bit yani 8 byte kullanir.
          "double" virgulden sonra 16 basamak icerebilir.

     7)boolen: true or false degerleri icin kullanilir. 1 bit kullanir.

     8)char:Tek karakterler icin kullanilir. 16 bit kullanir.
          Örn; A, c, 2, ?, _, =
          Note:"char" lara deger verirken degeri tek tirnak 'a' arasina koyunuz yoksa hata verir.


          Note: Java büyük ve kücük harflere duyarlidir.
                Java icin TRUE ile true tamamen farklidir.

      Note :Numeric Data Types:byte< short< int< long< float< long
            Numeric olmayan Data Types : boolean- char




                            Non-Primitive Data Types

      String: isim,adres , kimlik numarasi gibi bir veya birden fayla karakter iceren degerlerde kullanilir.
              String degerleri mutlaka cift tirnak arasina konulmalidir.
              String non-primitive dir.Yani bir string olusturdugunuzda Java size bir suru method verir.


            Primitive ile Non-Primitive lerin farki nedir?
            1)Non-primitive data type´larinda degerin yaninda methodlar vardir
            Primitive data typelarinda ise sadece deger vardir method yoktur
            2)Primitive data typelari Java tarafindan olusturulmustur,toplam 8 tanedir,biz Primitive data olusturamayiz
            Non-Primitive data typelari Java tarafindan da olusturulmustur biz de olusturabiliriz.None-primitive
            sayilamayacak kadar coktur,cunku her developer Non-primitive data type olusturabilir.
            3)Primitive data type isimleri kucuk harflerle baslar.
            Non-primitive data type isimleri buyuk harfle baslar.
            4)Primitive data typelar memoryde farkli buyuklukte yerler kullanir
            Non-Primitivelerin hepsi memory de ayni buyuklukte yer aliyor

     */

    public byte price = 12;
    public short populationOfVillage= 23000 ;
    public float priceOfShirt  = 13.99f;
    public double weightOfCell = 0.000012045;

    //siz "long" demenize ragmen java verilen sayiyi "int" kabul eder.
    //Bu yüzden,long variable´a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz.
    public long populationOfWorld= 7000000000L;

    //Burada "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar.
    public long x =1234;

    public boolean isOld = true;
    public boolean isReach=false;

    public char initial = 'a' ;

    public String name= "Tom Hanks";

    //Note:"main method" java'da arabanin motoru gibidir.
    //main method calismadan hic bir sey calismaz
    public static void main(String[] args) {




    }

}

