package Lesson12;


import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//������� ������ ������ � ��������� ���������� �������� �� �����. ����� � ��������
//������ ���� ����������� ��������.
public class ex_36 {
    public static void main(String[] args) {
        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> folders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���� �������� �� ����� (��������, C:/Exams): ");
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
            System.out.println("��������, ����������� � ����������� �������� (����: " + file.getPath() + ") :" + folders);
            System.out.println("�����, ����������� � ����������� �������� (����: " + file.getPath() + ") :" + files);
        } catch (NullPointerException e) {
            System.out.println("����� � ��������� ����� �� ����������!");
        }
    }
}
