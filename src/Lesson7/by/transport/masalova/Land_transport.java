package Lesson7.by.transport.masalova;

//- Количество колёс
//- Расход топлива(л/100км)
public abstract class Land_transport extends Transport {
    private int numberofwheels;
    private double consumption;

    public Land_transport(double power, double maxspeed, double mass, String brandname, int numberofwheels, double consumption) {
        super(power, maxspeed, mass, brandname);
        this.numberofwheels = numberofwheels;
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getNumberofwheels() {
        return numberofwheels;
    }

    public void setNumberofwheels(int number_of_wheels) {
        this.numberofwheels = number_of_wheels;
    }
}