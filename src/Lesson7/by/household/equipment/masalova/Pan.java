package Lesson7.by.household.equipment.masalova;

public class Pan extends Microwave {
    public Pan(Brand brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "You are using the pan {" +
                "brand- " + getBrand() +
                '}';
    }

    public void stewing(Device device) {

        System.out.println("Place the meal into the " + device + " and do not forget to mix several times.");
        System.out.println("Your meal has been stewed. ");
    }

}
