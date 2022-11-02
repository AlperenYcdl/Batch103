package day18arrayListspassbyvalue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {



        //Post Increment (Sonra arttirma)
        int a=5;
        int b=a++;

        System.out.println(b);//5 , artilara gelmeden "a" yi alip "b" ye koyar
        System.out.println(a);//6


        //Pre Increment(Once arttirma)
        int c=10;
        int d=++c;

        System.out.println(d);//11 , once artilari gordugu icin deger direk arttirilmis gozukur.
        System.out.println(c);//11

        //Post Decrement
        int e=20;
        int f=e--;

        System.out.println(f);//20 , eksilere gelmeden "e" yi alip "f"e koyar.
        System.out.println(e);//19

        //Pre Decrement
        int h=30;
        int i =--h;

        System.out.println(h);//29 , once eksileri gordugu icin deger direk azaltilmis gozterilir.
        System.out.println(i);//29
    }
}
