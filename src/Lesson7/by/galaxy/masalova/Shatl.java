package Lesson7.by.galaxy.masalova;

public class Shatl implements IStart {
    public boolean sysCheck() {
        boolean b = false;
        int a = (int) (Math.random() * 11);
        if (a > 3) {
            b = true;
        }
        return b;
    }


    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }


    public void start() {
        System.out.println("Старт Шатла.");

    }
}
