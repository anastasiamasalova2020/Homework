package by.clothes.masalova;

public class Overcoat implements Coat {

    @Override
    public void putOn() {
        System.out.println("You put on the overcoat.");
    }

    @Override
    public void putOff() {
        System.out.println("You put off the overcoat.");
    }
}
