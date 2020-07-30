package Lesson5;//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.

import java.util.Scanner;

public class ex_20 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String str2 = str + ' ';
        StringBuilder newS=new StringBuilder();
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str2.charAt(i) == str2.charAt(i + 1) && str2.charAt(i) == ' ') {
                int n = str2.length();
                str2 = str2.substring(0, i) + str2.substring(i + 1, n);
                System.out.println(str2 + "\t" + n);
                i--;
            }
        }
        if (str2.charAt(0) == ' ') {
            str2 = str2.substring(1, str2.length());
        }
        for (int i = 1; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                newS.append(str2.charAt(i-1));
            }
        }
        System.out.println("Слово, полученное из последних букв - "+newS);
    }
}
