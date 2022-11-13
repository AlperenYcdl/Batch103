package day29abstractioncollections;

public interface Engine extends Vehicle{

    //Class ---> Interface     ==> implements
    //Class ---> Class         ==> extends
    //Interface ---> Interface ==> extends
    //Interface ---> Class     ==> Mumkun degil

    //interface lerdeki tum variable lar otamatik olarak(default) "public" dir.
    //variable olusturdugumuzda normalde deger atamak zorunda degiliz.Ama interface lerdeki tum variable lar otamatik olarak(default) "final" dir.
    //interface lerdeki tum variable lar otamatik olarak(default) "static" dir.  Butun objeler icin ortak demek. static olan bir seye interface in ismi
    //ile ulasilabilir
    int price =2000;
    double weight = 23.5;


    void run();//run methodu


}
