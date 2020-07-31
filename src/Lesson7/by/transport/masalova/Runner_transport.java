package Lesson7.by.transport.masalova;

public class Runner_transport {
    public static void main(String[] args) {
        Passenger_transport a1 = new Passenger_transport(220, 250, 1000, "Audi", 4, 5.8, "Хетчбэк", 5);
        System.out.println(a1.to_string());
        a1.distanceFuel(3);
        System.out.println();

        Cargo_transport a2 = new Cargo_transport(200, 180, 6000, "MAZ", 8, 7.0, 16);
        System.out.println(a2.to_string());
        a2.ifSpace(14);
        System.out.println();

        Civil_transport a3 = new Civil_transport(500, 850, 19000, "Belavia", 10, 150, 110, false);
        System.out.println(a3.to_string());
        a3.ifSpace(120);
        System.out.println();

        Military_transport a4 = new Military_transport(780, 950, 22000, "Boeing", 12, 100, true, 50);
        System.out.println(a4.to_string());
        a4.shot();
        a4.ejectionSystem();
    }
}