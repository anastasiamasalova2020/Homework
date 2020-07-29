package by.clothes.masalova;

public class Runner_clothes {
    public static void main(String[] args) {
        Human vasya = new Human("Vasya", new Overcoat(), new Jeans(), new Heels());
        vasya.clothesUp();
        vasya.clothesDown();
    }
}