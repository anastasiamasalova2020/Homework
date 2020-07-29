package by.household.equipment.masalova;

public class Multicooker extends Oven {
    private int time2;

    public Multicooker(Brand brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "You are using the multicooker {" +
                "brand- " + getBrand() +
                '}';
    }

    public void airfryerMode(int Time_For_cooking_2) {
        this.time2 = Time_For_cooking_2;
        System.out.println("Airfryer mode:");
        System.out.println("Place the meal into the multicooker.");
        System.out.println("Your meal is ready after " + getTime2() + " minutes.");
    }

    public int getTime2() {
        return time2;
    }

    public void setTime_2(int time_2) {
        this.time2 = time2;
    }
}
