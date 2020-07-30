package Lesson5;//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ex_23 {
    public static void main(String[] args) {
        String str = "<p id=”p1” > По умолчанию браузеры выравнивают все абзацы по левому краю, ведь читаем мы слева направо. Но, используя, атрибут align, можно выровнять абзац по правому краю, по центру или по ширине.</p>\n" +
                "<p id2=”p2”> Еще два метода, использующие регулярные выражения, - это методы replaceFirst и replaceAll. Эти методы позволяют выполнить поиск и замену в строке.</p>";
        System.out.println("Не форматированная строка:\n" +str);
        String s = str.replaceAll("[<][p][^>]*[>]", "<p>");
        System.out.println("Отформатированная строка: \n" + s);
    }
}
