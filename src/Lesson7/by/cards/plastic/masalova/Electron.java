package Lesson7.by.cards.plastic.masalova;

public class Electron {
    private String bankname;
    private double sum;

    public Electron(String bankname, double sum) {
        this.bankname = bankname;
        this.sum = sum;
    }
    public String toString() {
        return "You are using the electronic card {" +
                "bank name- " + getBankname() +", initial balance= " + getSum()+" bel.r."+
                '}';
    }
    public double removeMoney(double money) {
        if (money<= this.sum) {

            System.out.println("Your balance after removal "+money+" is " + (sum-money));
            return sum -= money;
        }
        else {
            System.out.println("Error: you do not have enough money to do this operation.");
            return sum;
        }
    }
    public double aroundTheGlobe(String country,double currency,double sum){
        System.out.println("You can persuade in "+country);
        removeMoney(sum*currency);
        return sum;
    }


    public String getBankname() {
        return bankname;
    }


    public double getSum() {
        return sum;
    }

}

