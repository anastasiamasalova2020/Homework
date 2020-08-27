package Lesson12;

import java.io.*;

//В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы
public class AdditionalTask1 {
    public static boolean palindrome(String word) {
        String word1 = word.toLowerCase();
        StringBuilder original = new StringBuilder(word1);
        StringBuilder reverse = original.reverse();
        return (reverse.toString()).equals(word1);
    }

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("AddFile1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("Palindromefile1.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String result = bufferedReader.readLine();
        while (result != null) {
            if (AdditionalTask1.palindrome(result)) {
                bufferedWriter.write(result + "\n");
                System.out.println(result);
            }
            result = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
