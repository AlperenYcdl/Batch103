
package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    /*
          Note: Class ==> Variable ==> Object ==>Kullanacagiz
                        Method
     */
    public static void main(String[] args) {

    //Object nasil olusturulur?
    //1)Class ismini yaziniz    2)Objeye isim veriniz   3)=     4)new keyword´unu kullan    5)Class ismini parantezle beraber
        //Car                     myHonda           =             new                                 Car() ;

              Car myHonda = new Car ();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka); //Honda


    //MethodCreation class´indan object olusturduk
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5)); //8.0



        myHonda.hareketEt();
        myHonda.dur();



    }


        public void hareketEt () {
            System.out.println("Honda guzel hareket eder...");
        }

        public void dur () {
            System.out.println("Honda guvenli durur");
        }


    }



