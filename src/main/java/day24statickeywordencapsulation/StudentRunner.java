package day24statickeywordencapsulation;

public class StudentRunner {
    //degisimleri Class'da yapmadigimiz icin orada ayni ilk degerleri goruruz.
    //obje'de degisiklik yaptigimiz icin sadece degisikligi orada goruruz.
    public static void main(String[] args) {
        Student std1 = new Student();
        //getter
        System.out.println(std1.getStdId());//TH202201
        System.out.println(std1.getGpa());//3.8
        System.out.println(std1.isRetired());//false
        //setter
        std1.setStdId("AB");
        System.out.println(std1.getStdId());//AB
        std1.setGpa(4.0);
        System.out.println(std1.getGpa());//4.0
        std1.setRetired(true);
        System.out.println(std1.isRetired());//true
        Student std2 = new Student();
        std2.getStdId();
        System.out.println(std2.getStdId());//TH202201

    }
}


