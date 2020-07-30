package by.teachmeskills.robot;

import by.teachmeskills.robot.legs.*;
import by.teachmeskills.robot.hands.*;
import by.teachmeskills.robot.heads.*;

public class Runner_robot {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead headS = new SamsungHead(100);
        IHand handS = new SamsungHands(270);
        ILeg legS = new SamsungLegs(150);
        IHead headSony = new SonyHead(1400);
        IHand handSony = new SonyHands(155);
        ILeg legSony = new SonyLegs(160);
        IHead headT = new ToshibaHead(300);
        IHand handT = new ToshibaHands(170);
        ILeg legT = new ToshibaLegs(250);
        Robot robot1 = new Robot(headT, handS, legSony);
        System.out.println("Робот 1:");
        robot1.action();
        int s1 = robot1.getPrice();
        System.out.println("Цена робота 1=" + s1);
        Robot robot2 = new Robot(headSony, handT, legS);
        System.out.println("Робот 2:");
        robot2.action();
        int s2 = robot2.getPrice();
        System.out.println("Цена робота 2=" + s2);

        Robot robot3 = new Robot(headS, handSony, legT);
        System.out.println("Робот 3:");
        robot3.action();
        int s3 = robot3.getPrice();
        System.out.println("Цена робота 3=" + s3);
        int k;
        int s_max = Math.max(Math.max(s1, s2), s3);
        if (s_max == s1) {
            k = 1;
        } else if (s_max == s2) {
            k = 2;
        } else {
            k = 3;
        }
        System.out.println("Максимальная цена= " + s_max + " у робота под номером " + k);
    }
}
