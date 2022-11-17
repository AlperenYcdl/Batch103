package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*


    INTERWIEW QUESTIONS
    MAP'LER ARASINDAKI FARKLAR
            1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

            2) Treemap'ler natürel order yapar.
    LinkedHashMap giriş sırasına göre listeler.
    HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

            3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
    TreeMap'lerde key'ler icin "null" kullanılmaz.
    HashTable larda ikisi içinde null kullanılmaz.
     */


    /*
         1)HashTable bir map'dir,
         2)HashTable entrySet leri herhangi bir siralamaya tabi tutmaz.
         3)HasTable,HashMap'lerden daha yavaştır çünkü HasTable lar thread-safe(aynı andan birden fazla iş yapabilme becerisi)
            ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
         4)HasTable larda key null olamaz.Key i null yaparsaniz NullPointerException atar.
         5)HashTable larda value null olamaz. Value null yaparsaniz NullPointerException atar.

            Note: toString() method'u object'leri console'da detayları ile görebilmek için class'ların içinde oluşturulur.
                  toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.
     */
    public static void main(String[] args) {


        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);//{USA=4000000, Germany=8300000, Turkey=900000}


        //countryPopulations.put(null, 90000000);//HashTAble larda Key null olamaz. NullPointerException atar.
        //countryPopulations.put("France" , null);//HashTAble larda value null olamaz. NullPointerException atar

        //yukardakiler string vs javanin olusturduklari


        //asagidakileri class kendin olusturabilirsin ve data type i olarak kullanilabilir.
        Hashtable<String, Student> myStudent = new Hashtable<>();

        //1.entrySet
        myStudent.put("Math", new Student("Tom Hanks", "th@gmail.com", 21, true));

        //2.enrtySet
        myStudent.put("Science", new Student("Mary Star", "ms@gmail.com", 32, false));


        System.out.println(myStudent);//{Math=Student{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}
        // key =    value



        //Hashtable a verdiginiz datalarin birer birer bilgilerini almak icin.
        String name = myStudent.get("Math").name;
        System.out.println(name);//Tom Hanks

        int age = myStudent.get("Math").age;
        System.out.println(age);//21


    }
}
