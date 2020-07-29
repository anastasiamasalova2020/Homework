package by.teachmeskills.robot.hands;

public class SonyHands implements IHand {
    private int price;

    public SonyHands(int price) {
        this.price = price;
    }
    public SonyHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Вращаются руки Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
