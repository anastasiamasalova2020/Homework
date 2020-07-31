package Lesson7.by.galaxy.masalova;

public class Runner_galaxy {
    public static void main(String[] args) {
        Shatl shatl=new Shatl();
        Cosmostar cosmostar=new Cosmostar();
        System.out.println("Шатл: ");
        Galaxy.launch(shatl);
        System.out.println("Космостар: ");
        Galaxy.launch(cosmostar);
    }
}
