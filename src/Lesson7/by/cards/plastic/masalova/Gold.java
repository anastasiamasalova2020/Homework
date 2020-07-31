package Lesson7.by.cards.plastic.masalova;

//то же , что и у classic + скидки и льготы
public class Gold extends Classic {
    public Gold(String bankname, double sum) {
        super(bankname, sum);
    }

    @Override
    public String toString() {
        return "You are using the gold card {" +
                "bank name- " + getBankname() + ", initial balance= " + getSum() + " bel.r." +
                '}';
    }

    public double Discount(double sum, double percentage) {
        System.out.println("Your discount from the bank is " + percentage + '%');
        System.out.println("The final price after discount will be " + sum * (1 - percentage / 100));
        return getSum() - sum * (1 - percentage / 100);
    }
}
