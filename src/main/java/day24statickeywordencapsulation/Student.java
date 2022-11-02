package day24statickeywordencapsulation;

//Encapsulation: "Data Hiding(Gizlemek)" demektir.
//Data'yi nicin gizlersiniz? Data'yi dis etkenlerden korumak için.
//Data'yi nasil gizlersin? Access Modifier'ini "private" yaparak gizlerim.
//Data'yi gizledikten sonra başka Class'lardan okumak istersen ne yaparsin?
//"get method'lar(getter)" oluşturarak gizlediğimiz data'lari okunur hale getirebiliriz
//Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method'lar (setter)" olusturarak gizledigimiz datalari degistirilir hale getirebiliriz.
//Variable'ın "data type" ı ile get method'un "return type" ı aynı olmalıdır.

public class Student {

public String stdName="Tom Hanks";
private String stdId="TH202201";
private double gpa=3.8;
private boolean retired=false;



    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }








}


