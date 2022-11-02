package day21accessmodifiersinheritance;


public class StudentRunner_b {

    public static void main(String[] args) {
        //Normal app lerde binlerce class olabilir,ancak bir tane main kullanilir.
        //Genelde main method a sahip olan classlaran runner class denir.


        //Runner dan student a ulasmak icin obje olusturulur alttaki gibi. Objenin yardimi ile diger class a ulasilir.

        Student_a std1=new Student_a();
        System.out.println(std1.stdName);




    }

}
