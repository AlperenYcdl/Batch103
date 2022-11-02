package day22inheritanccepolymorphism;

public class Honda_b extends Car_b{

    public String color;

    public Honda_b() {
        super("White",54000);
        System.out.println("Honda Constructor");

    }

    public Honda_b(String color) {
        this.color = color;
    }

}


