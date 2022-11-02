package day22inheritanccepolymorphism;

public class HondaAccord_b extends Honda_b{

    /*
      1)Siz class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir cunku,
        Java ,Class in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
        constructor'in sart oldugunu bilir.
      2)Java nin otomatik olarak olusturdugu bu gorunmez constructor a "default constructor" denir.
      3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.
      4)Bir Class'da birden fazla constructor olabilir.Fakat bu constructorlarin parametre'leri farkli olmalidir.
      5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
          "this.price" syntax'i constructor'larin icinde kullanilir.

      6)Constructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
          Class daki variable degerlerini degistiremez...
     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord_b() {

    }

    public HondaAccord_b(int price) {
        this.price=price;

    }

    public HondaAccord_b(int price,int year) {
        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord_b(int price,int year,String make,String Model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=Model;
    }




}
