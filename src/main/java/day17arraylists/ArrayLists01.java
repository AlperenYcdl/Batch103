package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);// [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);//removeAll() kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);// [Trump, Tom, Taceddin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc = names.containsAll(myNames);//List in icinde hepsi var ise true alinir. herhangi biri yoksa false return eder.
        System.out.println(sonuc);//true

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);//[Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]


        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz.
        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]


        //Example 2: "shoes" elemaninin tum gorunumlerini siliniz.
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]


        //Example 3:bir tane salary list i olusturun ,eger salary 10.000 den az ise %20,10.000 ve ondan cok ise %10 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);//[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]


        for (Double w : salary) {

            if (w < 1000) {

                salary.set(salary.indexOf(w), w * 1.2);

            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }

        }
        System.out.println(salary);//[13579.500000000002, 9541.95, 16500.825, 10450.0, 22550.000000000004]


        //Example 4:Iki Arraylists in esit olup olmadigini kontrol eden kodu yaziniz.
        //Iki Arraylist in esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni index te olmali.
        //eleman sayilari esit olmali farkli olamaz.
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');
        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way
        int counter = 0;

        for (int i = 0; i < m.size(); i++) {
            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degil");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }

        if (counter == 0) {
            System.out.println("Listler esittir");


        }

        //2.Yol
        boolean esitmi = m.equals(n);
        if (esitmi) {
            System.out.println("Listler esittir");
        } else
            System.out.println("Listler esir degil");
    }


}


