package by.household.equipment.masalova;

public class Oven extends Pan {
    private int time;

    public Oven(Brand brand) {
        super(brand);
    }

    public String toString() {
        return "You are using the oven {" +
                "brand- " + getBrand() +
                '}';
    }

    public void ovenMode(int Time_For_cooking, Device device) {
        this.time = Time_For_cooking;
        System.out.println("Oven mode:");
        System.out.println("Place the meal into the " + device + '.');
        System.out.println("Your meal is ready after " + getTime() + " minutes.");
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
