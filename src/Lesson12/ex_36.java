package Lesson12;


import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.
public class ex_36 {
    public static void main(String[] args) {
        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> folders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь каталога на диске (например, C:/Exams): ");
        String path = sc.nextLine();
        sc.close();
        try {
            File file = new File(path);
            for (File item : Objects.requireNonNull(file.listFiles())) {
                if (item.isDirectory()) {
                    folders.add(item.getName());
                } else {
                    files.add(item.getName());
                }
            }
            System.out.println("Каталоги, находящиеся в изначальном каталоге (путь: " + file.getPath() + ") :" + folders);
            System.out.println("Файлы, находящиеся в изначальном каталоге (путь: " + file.getPath() + ") :" + files);
        } catch (NullPointerException e) {
            System.out.println("Файла с указанным путем не существует!");
        }
    }
}
