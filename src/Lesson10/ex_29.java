package Lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
public class ex_29 {
    public static void main(String[] args) {
        //не очень понятно, что в данном случае неудовлетворительные оценки: только нули либо отрицательные и большие 10=> в итоге совместила
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students (n):");
        int n = sc.nextInt();
        sc.close();
        List<Integer> marks = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            marks.add((int) (Math.random() * 50) - 25);
        }
        System.out.println("The first version of marks: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks.get(i) + "\t");
        }
        for (int i = 0; i < n; i++) {
            if ((marks.get(i) > 10 || marks.get(i) <= 0)) {
                marks.remove(i);
                i--;
                n--;
            }
        }
        System.out.println("\nThe final version of marks after removal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks.get(i) + "\t");
        }
    }
}
