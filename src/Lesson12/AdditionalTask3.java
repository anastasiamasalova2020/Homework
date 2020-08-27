package Lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//определите сами, хотите каждое слово на новой строке, хотите через запятую
//разделяйте, ваша программа делайте как считаете нужным.
//Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//встретилось ни одного недопустимого слова, то выводите сообщение о том что
//текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//сообщение, кол-во предложений не прошедших проверку и сами предложения
//подлежащие исправлению.
public class AdditionalTask3 {
    public static void main(String[] args) throws IOException {
        int mistakes = 0;
        ArrayList<String> blackW = new ArrayList<>();
        ArrayList<String> sentencesWithMistakes = new ArrayList<>();
        FileReader fileReader = new FileReader("BlackList.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String result = bufferedReader.readLine();
        while (result != null) {
            blackW.add(result);
            result = bufferedReader.readLine();
        }
        bufferedReader.close();
        StringTokenizer stringTokenizer;
        Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
        Matcher matcher;
        FileReader fileReader2 = new FileReader("SCensuroy.txt");
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        String result2 = bufferedReader2.readLine();

        while (result2 != null) {
            matcher = pattern.matcher(result2);
            System.out.println(result2);
            System.out.println();
            while (matcher.find()) {
                stringTokenizer = new StringTokenizer(result2);
                while (stringTokenizer.hasMoreTokens()) {
                    String st = stringTokenizer.nextToken().toLowerCase();
                    for (String word : blackW) {
                        if (word.equals(st)) {
                            mistakes += 1;
                            sentencesWithMistakes.add(matcher.group(1));
                        }
                    }
                }

            }
            result2 = bufferedReader2.readLine();
        }
        bufferedReader2.close();
        System.out.println("Количество ошибок: "+mistakes);
        System.out.println("Ошибки допущены в предложениях: "+sentencesWithMistakes.toString());

    }
}
