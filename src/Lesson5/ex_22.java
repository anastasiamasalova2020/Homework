package Lesson5;//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class ex_22 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String st=' '+str;
        Pattern pattern = Pattern.compile(" +[0-9A-F]+");
        Matcher matcher=pattern.matcher(st);
        System.out.println("Найденные шестнадцатеричные числа: ");
        while(matcher.find()){
            System.out.println();
            for(int i=matcher.start();i<matcher.end();i++){
                System.out.print(st.charAt(i));
            }
        }
        System.out.println();
    }
}
