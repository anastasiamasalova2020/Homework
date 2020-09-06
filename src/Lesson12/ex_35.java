package Lesson12;

import java.io.*;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.
public class ex_35 {

    public static void main(String[] args) throws IOException {
        DataOutputStream file = new DataOutputStream(new
                FileOutputStream("ex35file.txt"));
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 20);
            file.writeInt(a);
        }
        file.close();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new
                FileInputStream("ex35file.txt")));
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            int a = dis.readInt();
            System.out.print(a + "\t");
            sum += a;

        }
        dis.close();

        System.out.println("\nThe mean of all 20 numbers: " + 1.0 * sum / 20);

    }

}

