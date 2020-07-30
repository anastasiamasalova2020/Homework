package by.cards.plastic.masalova;

//то же, что и у electron + удаленное бронирование
public class Classic extends Electron {
    public Classic(String bankname, double sum) {
        super(bankname, sum);
    }

    @Override
    public String toString() {
        return "You are using the classic card {" +
                "bank name- " + getBankname() + ", initial balance= " + getSum() + " bel.r." +
                '}';
    }

    public double distantBooking(String rentname, String country, double currency, double money) {
        System.out.println("You can persuade " + rentname);
        aroundTheGlobe(country, currency, money);
        return getSum();
    }
}
