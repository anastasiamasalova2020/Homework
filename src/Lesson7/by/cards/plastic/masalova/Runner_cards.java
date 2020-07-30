package by.cards.plastic.masalova;

//Создать иерархию классов, описывающих банковские карточки.Иерархия должна иметь хотя бы три уровня.
public class Runner_cards {
    public static void main(String[] args) {
        System.out.println();
        Electron elC = new Electron("BSB bank", 1000);
        System.out.println(elC.toString());
        elC.removeMoney(1000);
        elC.aroundTheGlobe("The USA", 2.39, 220);


        System.out.println();
        Classic clC = new Classic("MTB bank", 100000);
        System.out.println(clC.toString());
        clC.removeMoney(6790);
        clC.aroundTheGlobe("The Netherlands", 2.79, 100);
        clC.distantBooking("Hotel", "Austria", 2.79, 90);


        System.out.println();
        Gold goldC = new Gold("Belgazprom bank", 18000);
        System.out.println(goldC.toString());
        goldC.removeMoney(1000);
        goldC.aroundTheGlobe("Russia", 3.4, 1000);
        goldC.distantBooking("Car", "Ukraine", 0.086, 1000);
    }
}
