package day28abstraction;

public interface Engine {

    /*

    1) Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
    bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.
   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

    2)Interface lerdeki tum methodlar "abstract" oldugu icin "interface" lere "fully abstraction" denir.
      "Abstract class " larda abstract method ve "concrete method " bir arada kullandigi icin
      "Abstract class " lara "fully abstraction" denmez.

    */

    //interface lerdeki tum methodlar "abstract" olmak zorundadir.

    //interface lerde abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
    // cunku java o methodun abstract oldugunu bilir.

    //interface lerdeki tum methodlar Java tarafindan otomatik olarak public kabul edilir bu yüzden
    //o methodlar icin public yazmaya gerek yoktur.

    //public abstract void eco () ; ile void eco (); ayni anlama gelir.
     void eco();

     void gas();

     void tsi();

     //default keyword kullanarak interface lerin icinde body si olan methodlar uretebilirsiniz.
    // Asagidaki non-static method dur. *objelere yapistirilir.non-static method a ulasmak icin obje olusturmamiz gerekir.
     public default int add(int a ,int b){
         return a+b;
     }

     //static keyword kullanarak interface'lerin icinde body'si olan methodlar uretebilirsiniz
     //asagidaki method "static method" dur
     public static String update(String str) {
         return str + "!";
     }





}
