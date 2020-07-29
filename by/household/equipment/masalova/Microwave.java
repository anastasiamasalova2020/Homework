package by.household.equipment.masalova;

public class Microwave {
    private Brand brand;

    public Microwave(Brand brand) {
        this.brand = brand;
    }

    public String toString() {
        return "You are using the microwave {" +
                "brand- " + brand +
                '}';
    }

    public void reheating(Device device) {
        System.out.println("Place the meal into the " + device + '.');
        System.out.println("Your meal has been reheated. ");
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
