package Lesson7.by.household.equipment.masalova;

public class Runner_kitchen {
    public static void main(String[] args) {
        System.out.println();
        Microwave microwave = new Microwave(Brand.Bosch);
        System.out.println(microwave.toString());
        Power_socket.connect();
        microwave.reheating(Device.Microwave);
        Power_socket.disconnect();


        System.out.println();
        Pan pan = new Pan(Brand.Hansa);
        System.out.println(pan.toString());
        pan.reheating(Device.Pan);
        pan.stewing(Device.Pan);



        System.out.println();
        Oven oven = new Oven(Brand.Karcher);
        System.out.println(oven.toString());
        Power_socket.connect();
        oven.reheating(Device.Oven);
        oven.stewing(Device.Oven);
        oven.ovenMode(20,Device.Oven);
        Power_socket.disconnect();


        System.out.println();
        Multicooker multicooker = new Multicooker(Brand.Thomas);
        System.out.println(multicooker.toString());
        Power_socket.connect();
        multicooker.reheating(Device.Multicooker);
        multicooker.stewing(Device.Multicooker);
        multicooker.ovenMode(45,Device.Multicooker);
        multicooker.airfryerMode(35);
        Power_socket.disconnect();
    }
}
