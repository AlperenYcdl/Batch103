package day08_stringManipulation;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane karakter kullanildigini gosteren code u yaz
        //           "Ali okula gitti." ==>14
        String str = "Ali okula gitti.";

        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ", "").length();

        System.out.println(num);

        //Example 2: Bir Stringdeki tum 'a' harflerini buyuk 'A' cevirin.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";
        String yeniS = s.replace("a", "A");
        System.out.println(yeniS);//AnkArA'nin tAsinA gozlerimin yAsinA bAk.


        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz.
        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);//Kara + dusunme An*


        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*******
        String studentId = "AC202117004";
        String yeniID = studentId.replaceAll("[0-9]", "*");
        System.out.println(yeniID);//AC*********

        /*
            Bir grup data yi ifade eden kod'lara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlari ifade etmek isterseniz ==> [0-9]
            2)TUm kucuk harfleri ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum harfler ==>     [a-zA-Z]
            5)Sesli harfler ==>   [aeiouAEIOU]
            6)Space characteri  ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}
         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 13 yasinda,dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();


        System.out.println(sonuc);


        //Example 6: Bir password un gecerli olup olmaduigini asagidaki kurallara gore test eden kodu yaziniz
    }

}
