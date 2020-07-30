package Lesson6.by.masalova.time;
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.
public class Time_Runner {
    public static void main(String[] args) {
        Time T1 = new Time(9, 45, 35);
        Time T2 = new Time(8,55,7);
        System.out.println("\nFor the first time period: ");
        System.out.println(T1.toString());
        System.out.println("The total number of seconds is "+T1.OnlySec()+'.');
        System.out.println("\nFor the second time period: ");
        System.out.println(T2.toString());
        System.out.println("The total number of seconds is "+T2.OnlySec()+'.');
        System.out.println("\nComparison:");
        Time.Comparison(T1,T2);
    }

}
