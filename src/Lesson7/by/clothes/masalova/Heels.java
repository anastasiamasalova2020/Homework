package by.clothes.masalova;

public class Heels implements Boots{
    @Override
    public void putOn() {
        System.out.println("You put on the heels.");
    }

    @Override
    public void putOff() {
        System.out.println("You put off the heels.");
    }
}
