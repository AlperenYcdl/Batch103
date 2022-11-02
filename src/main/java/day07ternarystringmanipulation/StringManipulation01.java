package day07ternarystringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
                                                    String Class Methodlari

                1)equals(): i) iki tane String in ayni olup olmadigini anlamamiza yarar
                            ii)equals() method'u "boolean" return eder.

                2)equalsIgnoreCase() : i)Iki tane String in ayni olup olmadigini buyuk harf kucuk harfe dikkar etmede anlamimizi saglar
                                       ii)equalsIgnoreCase() method'u "boolean" return eder.

                3)toLowerCase() : i)Bir Stringdeki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                  ii)toLowerCase() method'u "String" returng eder.

                4)toUpperCase() : i)Bir stringdeki tum harfleri buyuk harfe cevirmek icin kullanilir
                                  ii)toUpperCase() method'u "String" return eder.

                5)charAt() : i)Bir string den belli bir index deki charachteri almak icin kullanilir
                             ii)charAt() method'u "char" return eder.

                6)lenght() : i)Bir stringde kac tane character kullanildigini ogrenmek icin kullanilir
                             ii)lenght() method'u "int" return eder.

                7)contains() : i)Bir stringde belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                               ii)contains() method'u "boolean" return eder.

                 8)split() : i)Bir string i istedigimiz character den parcalamaya yarar
                             ii)split() method'u "Array" return eder.
        */

        /*
        Bir password un gecerli olup olmadiini asagidaki kurallara gore kontrol eden kodu yaziniz
            i)En az 8 character icermeli.
            ii)Space character icermemeli.
            iii)Ilk harfi buyuk harf olmali.
            iv)Son character "?" olmali.

        */

        String pwd = "Manisa12?";

        //i)En az 8 character kontrolu icin:
        boolean first = pwd.length() > 7;

        //i)Space olup olmadigini kontrol icin:
        boolean second = !pwd.contains(" ");

        //iii)Ilk harf buyuk olma kontrol u icin:
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'm';

        //iv)Son character kontrol u icin:
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';

        System.out.println(first && second && third && fourth);
    }
}
