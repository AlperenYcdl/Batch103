package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


         /*

                                               * * * İNTERWİEW SORUSU * * *


            "throw" ile "theows" arasindaki farklar nelerdir?
            1) "throw" method un body si icinde kullanilir."throws" ise method un isminden sonra kullanilir. ornek expection03class 20
            2) "throw" dan sonra obje olusturulur. ornek 23. "throws" dan sonra ise sadece Exception Class in ismi yazilir.
            3) "throw" method un icinde istedigimiz yerde Exception uretmek icin kullanilir. "throws" ise var olan
            check Exception i atmak icin kullanilir.
            4)"throw" dan sonra sadece bir tane Exception olabilir.
              "throws" dan sonra birden fazla Exception olabilir.
         */


public class ReadFileLineByLine {

    public static void main(String[] args) {


        readFileLineByLine();


    }

    public static void readFileLineByLine() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt")); //obje olusturduk / () -> constructor /  bu const. FileRider ile calisir.
            //satir satir okumak icin ; BufferedReader
            String Line = br.readLine();//readLine dosyaya gider  birinci satiri alir line a koyar.


            while (Line != null) {
                System.out.println(Line);//dosyadaki ilk satiri yazdirir. Java is easy.
                Line = br.readLine();//Her satiri buraya koyucak. satir atlatiyor okuduktan sonra.

            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlsi ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - " + e.getMessage());
        }


    }
}
