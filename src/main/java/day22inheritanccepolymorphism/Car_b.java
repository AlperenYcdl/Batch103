package day22inheritanccepolymorphism;

public class Car_b extends Vehicle_b{

    public String color;
    int km;




    public Car_b() {

    }

    public Car_b(String color,int km){
        super("Car");
        this.color = color;
        this.km = km;
        System.out.println("Car Constructor");
    }


}
