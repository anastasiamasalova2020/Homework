package by.transport.masalova;

//- Наличие системы катапультирования (true/false)
// - Кол-во ракет на борту
//Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то
//“Боеприпасы отсутствуют”.
//А так же метод катапультирование, который проверит если наличие системы катапультирования true, то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”
public class Military_transport extends Air_transport {
    private boolean ejectionsystem;
    private int rocketnumber;

    public Military_transport(double power, double maxspeed, double mass, String brandname, int wingspan, long mindistance, boolean ejection_system, int rocketnumber) {
        super(power, maxspeed, mass, brandname, wingspan, mindistance);
        this.ejectionsystem = ejection_system;
        this.rocketnumber = rocketnumber;
    }

    public String to_string() {

        return "Военный воздушный транспорт {" +
                "мощность= " + getPower() + " лошадиных сил либо " + Conversion_method.Conversion_method(getPower()) + " кВ, максимальная скорость= " + getMaxspeed() + " км/ч, масса= " + getMass() + " кг, марка- " + getBrandname() + ", размах крыльев= " + getWingspan() + "м, минимальная длина взлётно-посадочной полосы для взлёта= " + getMindistance() + " м, наличие системы катапультировани- " + isEjectionsystem() + " ,кол-во ракет на борту= " + getRocketnumber() +
                '}';
    }

    public void shot() {
        if (getRocketnumber() != 0) {
            System.out.println("Ракета пошла...");
            rocketnumber--;
            System.out.println("У вас осталось "+rocketnumber+" ракет.");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }
    public void ejectionSystem() {
        if (isEjectionsystem()) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }

    public int getRocketnumber() {
        return rocketnumber;
    }

    public void setRocketnumber(int rocket_number) {
        this.rocketnumber = rocket_number;
    }

    public boolean isEjectionsystem() {
        return ejectionsystem;
    }

    public void setEjectionsystem(boolean ejection_system) {
        this.ejectionsystem = ejection_system;
    }
}
