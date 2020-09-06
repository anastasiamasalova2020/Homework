package Lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//�������� 2 �����.
//1 - �. �������� �������� �����.
//2 - �. �������� ����� ������������ � ������(black list). ��������� �����
//���������� ����, ������ ������ ����� �� ����� ������, ������ ����� �������
//����������, ���� ��������� ������� ��� �������� ������.
//������: ���������� ��������� �������� �� ����� �������. ���� � ������ ��
//����������� �� ������ ������������� �����, �� �������� ��������� � ��� ���
//����� ������ �������� �� �������. ���� ���, �� �������� ����������������
//���������, ���-�� ����������� �� ��������� �������� � ���� �����������
//���������� �����������.
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
        System.out.println("���������� ������: "+mistakes);
        System.out.println("������ �������� � ������������: "+sentencesWithMistakes.toString());

    }
}
