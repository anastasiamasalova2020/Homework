

/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
*/
public class ex_3m{
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int hour = (m - min) / 60;
        int d = hour % 24;
        int day = (hour - d) / 24;
        int w = day % 7;
        int week = (day - w) / 7;
        System.out.println(min + " минут " + sec + " секунд");
        System.out.println((hour - day * 24) + " часов " + min + " минут " + sec + " секунд;");
        System.out.println((day - 7 * week) + " дней " + (hour - day * 24) + " часов " + min + " минут " + sec + " секунд;");
        System.out.println(week + " недель " + (day - 7 * week) + " дней " + (hour - day * 24) + " часов " + min + " минут " + sec + " секунд.");
    }
}
