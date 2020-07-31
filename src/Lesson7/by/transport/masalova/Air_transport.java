package Lesson7.by.transport.masalova;
// - Размах крыльев (м)
// - Минимальная длина взлётно-посадочной полосы для взлёта
public abstract class Air_transport extends Transport {
    private int wingspan;
    private long mindistance;

    public Air_transport(double power, double maxspeed, double mass, String brandname, int wingspan, long mindistance) {
        super(power, maxspeed, mass, brandname);
        this.wingspan = wingspan;
        this.mindistance = mindistance;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public long getMindistance() {
        return mindistance;
    }

    public void setMindistance(long min_distance) {
        this.mindistance = min_distance;
    }
}
