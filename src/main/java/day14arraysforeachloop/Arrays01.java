package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Arrays01 {


    //Arrays lerin icine "primitive data typle" ri ve "reference" lar yerlestirilebilir.
    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surpise you";

        System.out.println(Arrays.toString(str));

        //String bir array olusturunuz ve "Tom"  ve "Tom " dan onceki tum elemanlari ekrana yazdiriniz.

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {

            System.out.print(w + " ");

            if (w.equals("Tom")) {
                break;
            }

        }


        System.out.println();

        //String bir array olusturunuz Tom ve Jane haric tum elemanlari ekrana yazdiriniz.
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr) {

            if (w.equals("Tom") || w.equals(("Jane"))) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        //Example 3: Kullanici ile beraber array olusturun ve icine dat ekleyiniz
        //           Bir ogretmenin sinifindaki ogrencilerin isimlerini application a yuklemesini saglayan kodu yaziniz


        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi girilicek?");
        int numOfStd = input.nextInt();


        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz. ");

        for (int i = 1; i <= numOfStd; i++) {

            System.out.println("Lutfen " + i + ". Ogrencinin ismini giriniz");

            String stdName=input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;
            }

            names[i-1] = stdName;

        }

        System.out.println(Arrays.toString(names));


    }


}
