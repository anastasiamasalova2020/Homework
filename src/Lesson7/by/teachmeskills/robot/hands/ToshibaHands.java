package Lesson7.by.teachmeskills.robot.hands;

public class ToshibaHands implements IHand {
    private int price;

    public ToshibaHands(int price) {
        this.price = price;
    }

    public ToshibaHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Вращаются руки Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
