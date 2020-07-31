package Lesson7.by.transport.masalova;

// - Мощность(в лошадиных силах)
// - Максимальная скорость(км/ч)
// - Масса (кг)
// - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )

public abstract class Transport {
    private double power;
    private double maxspeed;
    private double mass;
    private String brandname;

    public Transport(double power, double maxspeed, double mass, String brandname) {
        this.brandname = brandname;
        this.mass = mass;
        this.maxspeed = maxspeed;
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMax_speed(double max_speed) {
        this.maxspeed = max_speed;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrand_name(String brand_name) {
        this.brandname = brand_name;
    }
}
