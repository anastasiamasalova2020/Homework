package by.transport.masalova;

// - Кол-во пассажиров
// - Наличие бизнес класса (true/false)
//Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим
// “Вам нужен грузовик побольше ”.
//Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров.
public class Civil_transport extends Air_transport {
    private int passengers;
    private boolean businessclass;

    public Civil_transport(double power, double maxspeed, double mass, String brandname, int wingspan, long mindistance, int passengers, boolean businessclass) {
        super(power, maxspeed, mass, brandname, wingspan, mindistance);
        this.passengers = passengers;
        this.businessclass = businessclass;
    }
    public String to_string(){

        return "Гражданский воздушный транспорт {" +
                "мощность= " + getPower() +" лошадиных сил либо "+ Conversion_method.Conversion_method(getPower()) +" кВ, максимальная скорость= "+getMaxspeed()+" км/ч, масса= "+getMass()+" кг, марка- "+getBrandname()+", размах крыльев= "+getWingspan()+"м, минимальная длина взлётно-посадочной полосы для взлёта= "+getMindistance()+" м, количество пассажиров= "+getPassengers()+" ,наличие бизнесс класса "+isBusinessclass()+
                '}';
    }
    public void ifSpace(int number_of_passengers){
        if(number_of_passengers<=getPassengers()){
            System.out.println("Вам надо разместить "+number_of_passengers+" человек.\n"+"Самолёт загружен.");
        }
        else{
            System.out.println("Вам надо разместить "+number_of_passengers+" человек.\n"+"Вам нужен самолёт побольше.");
        }
    }
    public boolean isBusinessclass() {
        return businessclass;
    }

    public void setBusinessclass(boolean businessclass) {
        this.businessclass = businessclass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}