package by.clothes.masalova;

public class Jeans implements Trousers {
    @Override
    public void putOn() {
        System.out.println("You put on the jeans.");
    }

    @Override
    public void putOff() {
        System.out.println("You put off the jeans.");
    }
}
