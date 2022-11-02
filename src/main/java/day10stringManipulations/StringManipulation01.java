package day10stringManipulations;

public class StringManipulation01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        //startsWith() kodu ilk 5 karakterden sonraki Stringe bakar ve o String in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile baslamiyorsa "true", baslamiyorsa "false" return eder.
        //boolean b = a.startsWith("kola", 5);
        boolean b = a.startsWith("va", 2);

        System.out.println(b);

        //replaceFirst("a","*"); kod Stringdeki ilk a yi * cevirir.
        //replace("a","*"); kod Stringdeki tum a lari * e cevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*ava kolaydir

        //concat() method u iki tane String i birbirine yapistirmaya yarar.
        //Concatenation islemi iki turlu yapilabilir; i)+ ile ii)concat() ile yapilabilir
        //Java bir islem icin method uretmisse o method u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);//J*ava kolaydir. Anladin mi

        String e = "   Tom Hanks    ";
        System.out.println(e);//"   Tom Hanks    "

        //trim method u bir String in bas ve sonundaki "space" karakterlerini siler,aradaki "space" karakterlerine dokunmaz.
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h = "Kava";
        String i = "Java";

        //h.compareTo(i); kod iki tane String i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harfe duyarli olmasini istemezseniz h.compareToIgnoreCase(); kullanabilirsiniz.
        //h.compareTo(i); kodda h nin alphabetik sirasindan i nin alfabetik sirasi cikarilir
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5); kodu a String ini yanayana 5 kere yapistirir.
        //a.repeat(0); empty String eder.
        //Java Documente'e ulasmak icin  Windows==> ctrl e basili tutun
        String n = a.repeat(-5);
        System.out.println(n);


    }


}
