package Lesson5;//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.

import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        String znPrep = ",.:;!?—()";
        int k = 0;
        System.out.println("Введите ваш текст: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        for (int i = 0; i < text.length(); i++) {
                if (znPrep.indexOf(text.charAt(i)) != -1 || text.charAt(i) == '"') {
                    System.out.print(text.charAt(i) + "\t");
                    k++;
                }
        }
        System.out.println("\nОбщее количество знаков препинания= " + k);
    }
}