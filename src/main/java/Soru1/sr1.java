package Soru1;

import java.util.*;

public class sr1 {


    public class FilmTahminiUstunBy {

    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız
      */


        static List<String> film = new ArrayList<>(Arrays.asList("KELEBEK", "MUCIZE", "AYLA", "DUNKIRK",
                "MEMENTO", "GORA", "ESKIYA", "FIGHTCLUB", "KARAKOMIK", "KILLBILL", "AMELIE", "XMEN", "OLDBOY",
                "BATMAN", "KELOGLAN", "TOYSTORY", "MUTLULUK", "SEVEN"));


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("*********FILM TAHMIN OYUNUNA HOSGELDINIZ*********");
                System.out.print("1-" + (film.size()) + " arasinda bir sayi giriniz(Cikmak icin sayi disinda bir karakter giriniz):");
                Collections.shuffle(film);
                int secim = scan.nextInt();
                while (secim < 1 || secim > film.size()) {
                    System.out.println("Hatali giris yaptiniz");
                    secim = scan.nextInt();
                }
                secim--;
                String secilenfilm = film.get(secim);
                String gizlifilm = secilenfilm.replaceAll("\\w", "_");
                int haksayisi = secilenfilm.length() * 2;
                String[] arrfilm = secilenfilm.split("");
                String[] gizlifilmarr = gizlifilm.split("");
                System.out.println("Sectiginiz filmin harf sayisi: " + arrfilm.length);
                String tahmin = scan.nextLine().replaceAll("\\W", "").toUpperCase();
                while (haksayisi >= 0) {
                    if (tahmin.equals(secilenfilm) || !Arrays.toString(gizlifilmarr).contains("_")) {
                        System.out.println("Tebrikler, filmi dogru tahmin ettiniz :) \nFilmin adi: " + secilenfilm);
                        break;
                    } else if (haksayisi == 0) {
                        System.out.println("Filmi tahmin edemediniz...\nFilmin adi: " + secilenfilm);
                        break;
                    } else {
                        System.out.println("Kalan tahmin sayiniz: " + haksayisi + "\n" + Arrays.toString(gizlifilmarr)
                                + "\nLütfen filmin adini tahmin ediniz ya da bir adet harf giriniz:");
                        tahmin = scan.nextLine().replaceAll("\\W", "").toUpperCase();
                        if (tahmin.length() != 1) haksayisi--;
                        else if (!secilenfilm.contains(tahmin)) haksayisi--;
                        else {
                            for (int i = 0; i < arrfilm.length; i++) {
                                if (!arrfilm[i].equals(tahmin)) {
                                    arrfilm[i] = "_";
                                }
                            }
                            for (int i = 0; i < arrfilm.length; i++) {
                                if (!arrfilm[i].equals("_")) {
                                    gizlifilmarr[i] = arrfilm[i];
                                }
                            }
                            haksayisi--;
                            arrfilm = secilenfilm.split("");

                        }
                    }
                }
            }
        }
    }




}
