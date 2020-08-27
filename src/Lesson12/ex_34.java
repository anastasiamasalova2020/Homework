package Lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
public class ex_34 {
    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("-?\\d+");
        List<Integer> numbers = new ArrayList<>();
        Matcher m;
        FileReader file = new FileReader("ex34file.txt");
        BufferedReader bufferedReader = new BufferedReader(file);
        String result = bufferedReader.readLine();

        while (result != null) {
            m = p.matcher(result);
            while (m.find()) {
                numbers.add(Integer.parseInt(m.group()));
            }
            System.out.println(result);
            result = bufferedReader.readLine();
        }
        bufferedReader.close();
        int sum = 0;
        System.out.print("All the numbers: " + numbers);
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nThe sum of all numbers: " + sum);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);
        System.out.println("The numbers without repetitions: " + set);
    }

}