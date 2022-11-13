package day28abstraction;

public class Bird extends Mammal{

    @Override
    public void eat() {
        System.out.println("Birds eat");

    }

    @Override
    public void move() {
        System.out.println("Birds move");

    }
}
