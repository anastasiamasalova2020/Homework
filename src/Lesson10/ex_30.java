package Lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
public class ex_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of members (n):");
        int n = sc.nextInt();
        sc.close();
        List<Integer> collection = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            collection.add((int) (Math.random() * 10) - 5);
        }
        System.out.println("The first version of marks: ");
        for (int i = 0; i < n; i++) {
            System.out.print(collection.get(i) + "\t");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (collection.get(i).equals(collection.get(j))) {
                    collection.remove(j);
                    n--;
                    j--;
                }
            }
        }
        System.out.println("\nThe final version of marks after removal repeated numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(collection.get(i) + "\t");
        }
    }
}
