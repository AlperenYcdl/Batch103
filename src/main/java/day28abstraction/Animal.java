package day28abstraction;

public abstract class Animal {






    //body si olmayan methodlar "abstract method" olarak adlandirilir
    //Bit method u abstract yapmak icin ; i)Method body i sil ii)"abstract" keyword kullan
    //"abstract" method lar "abstract class" icinde olmalidir
    public abstract void eat() ;


    //"abstract class" larda hem "abstract" hem de "concrete"(non-abstract) method kullanilabilir.
    public  void drink() {
        System.out.println("Animals drink...");
    }

    //abstract "move" method olusturunuz

    //void olmak zorunda degil
    public abstract void move();






}
