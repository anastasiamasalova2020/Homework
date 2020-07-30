package Lesson6.by.masalova.time;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int totSec;

    public Time(int hours, int minutes, int seconds) {//конструктор для 3 параметров
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totSec) {//конструктор для 1 параметра
        this.hours = (totSec - totSec % 3600) / 3600;
        this.minutes = (totSec - hours * 3600 - totSec % 60) / 60;
        this.seconds = totSec - hours * 3600 - minutes * 60;
    }

    public int OnlySec() {//распечатывает общее количество секунд
        return hours * 3600 + minutes * 60 + seconds;
    }

    public static void Comparison(Time T1, Time T2) {
        if (T1.OnlySec() > T2.OnlySec()) {

            System.out.println(T1.toString() + " is larger.");

        } else if (T2.OnlySec() > T1.OnlySec()) {

            System.out.println(T2.toString() + " is larger.");
        } else {

            System.out.println("The first and the second time periods are equal.");
        }
    }

    public String toString() {
        return "Time period {" +
                "hours= " + hours +
                ", minutes= " + minutes + ", seconds= " + seconds +
                '}';
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotSec() {
        return totSec;
    }

    public void setTotSec(int totSec) {
        this.totSec = totSec;
    }

}
