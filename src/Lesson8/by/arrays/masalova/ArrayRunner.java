package Lesson8.by.arrays.masalova;

import java.util.Scanner;

public class ArrayRunner {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr2 = {"There", " is", " no", " wi-fi", " in", " the", " forest", " but,", " you", " will", " find", " a", " better", " connection "};
        Array<Integer> array1 = new Array<>(arr1);
        Array<String> array2 = new Array<>(arr2);

        System.out.println("Ваш массив №1: ");
        for (Integer integer : arr1) {
            System.out.print(integer + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите индекс элемента из массива №1, который хотите получить: ");
        int index1 = scanner.nextInt();
        System.out.println("arr1[" + index1 + "]=" + array1.getMember(index1));
        System.out.println("Ваш массив №2: ");
        for (String s : arr2) {
            System.out.print(s);
        }
        System.out.println("\nВведите индекс элемента из массива №2, который хотите получить: ");
        int index2 = scanner.nextInt();
        System.out.println("arr2[" + index2 + "]=" + array2.getMember(index2));
        scanner.close();

    }
}
