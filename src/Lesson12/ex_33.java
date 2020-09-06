package Lesson12;

import java.io.*;
import java.util.StringTokenizer;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.
public class ex_33 {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        int counter1 = 0;
        FileReader file = new FileReader("ex33file.txt");
        BufferedReader afterBook = new BufferedReader(file);
        String result = afterBook.readLine();
        StringTokenizer stringTokenizer;
        StringTokenizer stringTokenizer1;
        while (result != null) {
            stringTokenizer = new StringTokenizer(result);
            stringTokenizer1 = new StringTokenizer(result, ",.!&:;-)(");
            counter += stringTokenizer.countTokens();
            counter1 += stringTokenizer1.countTokens();
            System.out.println(result);
            result = afterBook.readLine();
        }
        afterBook.close();
        System.out.println("\nThe number of words: " + counter);
        System.out.println("\nThe number of punctuation marks: " + counter1);

    }
}



