package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1:"Anlik tarihi"(Curent date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate=LocalDate.now();

        System.out.println(currentDate);//2022-10-21


        //Example 2:"Anlik zamani"(Curent time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime=LocalTime.now();

        System.out.println(currentTime);//19:41:46.920000400


        //Example 3: "Anlik zamani"(Curent time) ve "Anlik tarihi"(Curent date) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime=LocalDateTime.now();

        System.out.println(currentDateTime);//2022-10-21T19:45:19.137292200


        //Example 4: Japonya'daki "Anlik zamani"(Curent time) ve "Anlik tarihi"(Curent date) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:29.257804900

        //Example 5: Istanbul'daki "Anlik zamani"(Curent time) ve "Anlik tarihi"(Curent date) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:52:31.764027400


        //Example 6: Bu günden 789 gün sonra emekli olacaginiza gore ,emeklilik tarihini hesaplayan code u yaziniz...

         //LocalDate currentDate2= LocalDate.now();
        LocalDate countDate= LocalDate.of(2022,10,21);
        LocalDate retireDate2=countDate.plusDays(789);

         System.out.println(retireDate2);

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan code'u yazaniz.
        LocalDate dobAli=LocalDate.of(2005,5,17);
        LocalDate dobVeli=LocalDate.of(2013,2,8);

        //between(dobAli,dobVeli); method u kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff= ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);//2824

        //İstanbulun fethi ile ,Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
        LocalDate istanbulFethi=LocalDate.of(1453,5,29);
        LocalDate cumhuriyetinKurulusu=LocalDate.of(1923,10,29);

        Long aySayisi=ChronoUnit.MONTHS.between(istanbulFethi,cumhuriyetinKurulusu);
        System.out.println(aySayisi);//

        //Example 9; Verilen Tarihin hangi burctta oldugunu gösteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 3, 22);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }
    }
}
