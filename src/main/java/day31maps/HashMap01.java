package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap01 {
    /*
         1)Map'ler key-value structure kullanir
         2)Key'ler unique'dir
         3)Value'lar tekrarli data icerebilir
         4)Map'lerde eleman degil EntrySet kullaniriz.
         5)Key'ler de null tekrarsiz olarak kullanilir
         6)Value'lar null kabul eder.
         7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
         8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
      */


    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);
        System.out.println(studentAges); // {null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //Map'den sadece key'ler nasil alinir
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        //Map'den sadece value'lar nasil alinir
        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[66, null, null, 21, 76, 12, 75, 88]



        //Belli bir key e ait value nasil alinir?
        Integer cuneytAge=studentAges.get("Cuneyt");
        System.out.println(cuneytAge);//75


        //Example 1:Tiúm integer yaslarin ortalamasini hesaplayan kodu yaziniz
        Collection<Integer> ages=studentAges.values();
        int sum=0;
        double counter=0;
        for(Integer w : ages){

            if(w!=null){
                sum =sum+w;
                counter++;
            }
        }
        System.out.println("Ortalama yas==> " + sum/counter);//Ortalama yas==> 56.333333333333336


        //Example 2:A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz

        Set<String> names = studentAges.keySet();
       int sum1=0;

        for (String w : names){
            if (w!=null && !w.startsWith("A")){
                sum1=sum1+w.length();

            }
        }

        System.out.println(sum1);//25


        //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet'i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);
    }
}
