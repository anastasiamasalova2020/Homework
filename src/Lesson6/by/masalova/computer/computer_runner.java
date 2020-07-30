package Lesson6.by.masalova.computer;

import java.util.Scanner;

public class computer_runner {
    public static void main(String[] args) {
        computer comp1 = new computer();
        comp1.setProcessor(64);
        comp1.setOperativeMemory(16);
        comp1.setHDisk("HDD");
        comp1.setResource(1000);
        System.out.println("\n" + comp1.toString() + "\n");
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 or 1 for switching on: ");
            int n1 = sc.nextInt();
            computer.switchOn(n1);
    }
}

