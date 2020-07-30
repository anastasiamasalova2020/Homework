package by.transport.masalova;

//- Тип кузова
// - Кол-во пассажиров
//Для легкового разработать метод который будет принимать время и считать сколько километров проедет
//машина двигаясь с максимальной скоростью и сколько топлива она израсходует за это время,
// результат вывести в консоль, расчёт расходуемого топлива вынести в отдельный метод private.
//
//Результат работы метода должен вывести такую строчку:
//За время (ваше введённое время) ч, автомобиль (марка автомобиля)
//двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
//проедет (xxx) км  и израсходует (xxx) литров топлива.
//
//Мой результат выглядит так:
//“За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует 46.0 литров топлива”
public class Passenger_transport extends Land_transport {
    private String bodyworktype;
    private int passengers;

    public Passenger_transport(double power, double maxspeed, double mass, String brandname, int numberofwheels, double consumption, String bodyworktype, int passengers) {
        super(power, maxspeed, mass, brandname, numberofwheels, consumption);
        this.bodyworktype = bodyworktype;
        this.passengers = passengers;
    }
    public String to_string(){

        return "Пассажирский транспорт {" +
                "мощность= " + getPower() +" лошадиных сил либо "+ Conversion_method.Conversion_method(getPower()) +" кВ, максимальная скорость= "+getMaxspeed()+" км/ч, масса= "+getMass()+" кг, марка- "+getBrandname()+", количество колёс= "+getNumberofwheels()+", расход топлива= "+getConsumption()+" л/100км, тип кузова- "+getBodywork_type()+", количество пассажиров= "+getPassengers()+
                '}';
    }
    public void distanceFuel(double timeinhours){
        System.out.println("За "+timeinhours+" часов легковая машина "+getBrandname()+ " проедет "+getMaxspeed()*timeinhours+" км. и потратит "+fuelLost(timeinhours)+" л. топлива");
    }
    private double fuelLost(double timeinhours){
        return getMaxspeed()*timeinhours*getConsumption()/100;
    }
    public String getBodywork_type() {
        return bodyworktype;
    }

    public void setBodywork_type(String bodywork_type) {
        this.bodyworktype = bodywork_type;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

