package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        //Example 1:java dan aldiginiz Date i "Ay,gun,yil" olarak yaziniz

        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);//2022-10-21


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1);// 10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);// Eki/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);// Ekim/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");//"M" 10 dan kucuk aylari 1,2,3,etc seklinde yazar.
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);// 10/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5);// 10/21/2022

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");//"d" 10 dan kucuk gunleri 1,2,3 etc seklinde yazar, 01,02,03 kullanmaz
        String formattedDate6 = dtf6.format(currentDate);
        System.out.println(formattedDate6);// 10/21/2022


        //Example 2:Java dan aldiginiz Time in formatini degistiriniz.
        LocalTime myTime= LocalTime.of(16,23,54,2345);
        System.out.println(myTime);//16:23:54.000002345

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini ,"hh" 12 saat sistemini kullanir.
        String formattedMyTime=dtf7.format(myTime);
        System.out.println(formattedMyTime);//04:23


        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm  a");//
        String formattedMyTime2=dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23  ÖS


    }
}
