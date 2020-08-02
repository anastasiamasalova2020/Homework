package Lesson9.by.arrays.masalova;

import java.util.Scanner;

public class ArrayRunner {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr2 = {"There", " is", " no", " wi-fi", " in", " the", " forest", " but,", " you", " will", " find", " a", " better", " connection "};
        Double[] arr3 = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9};
        Array<Integer> array1 = new Array<>(arr1);
        Array<String> array2 = new Array<>(arr2);
        Array<Double> array3 = new Array<>(arr3);
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

        System.out.println("Ваш массив №3: ");
        for (Double d : arr3) {
            System.out.print(d + "\t");
        }
        System.out.println("\nВведите индекс элемента из массива №3, который хотите получить: ");
        int index3 = scanner.nextInt();
        scanner.close();
        System.out.println("arr3[" + index3 + "]=" + array3.getMember(index3));
    }
}
