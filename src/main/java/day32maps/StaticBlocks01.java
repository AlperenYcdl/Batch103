package day32maps;

public class StaticBlocks01 {
    //variable burasi. 1.class 2.main method 3. variable,  sirasiyla olusturulur
    public static double pi;

    static {

        System.out.println("Static block 2");
    }

    //static block lar ihtiyacimiz olan variable larin class olusturma safhasinda elimizde olmasini saglar.
    // static block lar Class icindeki her seyden once calistirilir. "main method"'dan ve diger tum methodlardan once calistirilir.
    // static block lar icinde sadece "static variable" lara deger atanabilir.
    //1 den fazla static block var ise üstteki once calistirilir.


    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }
}
