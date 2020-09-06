package Lesson12;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл.
//Разбиваем текст на предложения. Используя методы класса TextFormater
//определяем подходит ли нам предложение. Если подходит добавляем его в
//новый файл
public class AdditionalTask2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("AddFile2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("PalindromeFile2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
        Matcher matcher;
        String result = bufferedReader.readLine();
        matcher = pattern.matcher(result);
        while (result != null) {
            while (matcher.find()) {
                if (TextFormater.ifPalindrome(matcher.group(1))) {
                    bufferedWriter.write(matcher.group(1));
                    continue;
                }
                if ((TextFormater.words(matcher.group(1)) >= 3 && TextFormater.words(matcher.group(1)) <= 5)) {
                    bufferedWriter.write(matcher.group(1));
                }
            }
            result = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
