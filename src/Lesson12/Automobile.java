package Lesson12;

import java.io.Serializable;

public class Automobile implements Serializable {
    private String marka;
    private double cost;
    private double speed;
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Auto{"+"marka- "+getMarka()+", Speed= "+getSpeed()+"m/h, Cost= "+getCost()+"}";
    }
}
