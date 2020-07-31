package Lesson7.by.transport.masalova;

public class Cargo_transport extends Land_transport {
    private double payloadcapacity;

    public Cargo_transport(double power, double maxspeed, double mass, String brandname, int numberofwheels, double consumption, double payloadcapacity) {
        super(power, maxspeed, mass, brandname, numberofwheels, consumption);
        this.payloadcapacity = payloadcapacity;
    }

    public String to_string(){

        return "Грузовой транспорт {" +
                "мощность= " + getPower() +" лошадиных сил либо "+ Conversion_method.Conversion_method(getPower()) +" кВ, максимальная скорость= "+getMaxspeed()+" км/ч, масса= "+getMass()+" кг, марка- "+getBrandname()+", количество колёс= "+getNumberofwheels()+", расход топлива- "+getConsumption()+" л/100км, грузоподъёмность= "+getPayloadcapacity()+'т'+
                '}';
    }
    public void ifSpace(double weight_of_cargo){
        if(weight_of_cargo<=getPayloadcapacity()){
            System.out.println("Вам надо погрузить "+weight_of_cargo+" т. груза.\n"+"Грузовик загружен.");
        }
        else{
            System.out.println("Вам надо погрузить "+weight_of_cargo+" т. груза.\n"+"Вам нужен грузовик побольше.");
        }
    }
    public double getPayloadcapacity() {
        return payloadcapacity;
    }

    public void setPayloadcapacity(double payloadcapacity) {
        this.payloadcapacity = payloadcapacity;
    }
}