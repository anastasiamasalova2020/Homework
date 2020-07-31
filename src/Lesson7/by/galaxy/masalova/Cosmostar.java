package Lesson7.by.galaxy.masalova;

public class Cosmostar implements IStart {
    public boolean sysCheck() {
        boolean b = false;
        int a = (int) (Math.random() * 20);
        if (a % 2 == 0) {
            b = true;
        }
        return b;
    }

    public void engineStart() {
        System.out.println("Двигатели Космостара запущены. Все системы в норме.");
    }

    public void start() {
        System.out.println("Старт Космостара.");

    }
}
