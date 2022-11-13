package day29abstractioncollections;


    /*

    "abstract method" lar sadece ne yapilacigini soyler (what to do)
    "conceret method" lar ne yapilacigi (what to do) ile birlikre nasil yapilacigini (how to do)da soyler.

    "interface" ler bir yapilicaklat islerin listesidir.(To do list)

    "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu methodlarin
     return typelari ayni olmalidir.Aksi takdirde hata verir.

     "interface" lerde constructor olmadigi icin interface lerden obje olusturulamaz.
     "abstract class" larda class olduklari icin constructor vardir. Ama constructor lar abstract class larda object olusturamazlar.


     Soru "Abstract Class" ile "Interface" in farklari nelerdir?
          1)Method
                  "Abstract Class" hem abstract he, de concerete methodlar icerebilir.
                  "Interface" ler ise sadece abstract methodlar icerir
                  Ama istersek Interface ler icinde "default" ve "static" keyword ler kullanarak concerete methodlar olusturabiliriz.
          2)Variable
                  "Abstract Class" larda normal Class lardaki gibi her turlu variable olusturabilir.
                  "Interface" ler ise variable lar public static ve final olmak zorundadir.

           3)Inheritance
                  "Abstract class" lar class olduklari icin multiple inheritance'a musade etmezler
                  "Interface"ler ise multiple inhertance 'ı destekler

           4)Object Creation
                  "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
                  "Interface" lerde ise constructor olmadigindan object olusturulamaz.




        Soru: Object Oriented Programming Language prensipleri(principles) nelerdir? (OOP)
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction
    */



public class Civic implements Engine, Ac{

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}
