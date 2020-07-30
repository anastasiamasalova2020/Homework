package by.teachmeskills.robot.legs;

public class SonyLegs implements ILeg{
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }

    @Override
    public void step() {
        System.out.println("Ходят ноги Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
