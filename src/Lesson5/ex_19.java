package Lesson5;/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/


import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        int k = 0;
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String str2 = str + ' ';
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str2.charAt(i) == str2.charAt(i + 1) && str2.charAt(i) == ' ') {
                int n = str2.length();
                str2 = str2.substring(0, i) + str2.substring(i + 1, n);
                i--;
            }
        }
        if (str2.charAt(0) == ' ') {
            str2 = str2.substring(1, str2.length());
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                k++;
            }
        }
        System.out.println("Количество слов= " + k);
    }
}