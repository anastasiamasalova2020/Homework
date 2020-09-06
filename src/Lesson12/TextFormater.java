package Lesson12;

import java.util.StringTokenizer;

//1. ����� ��������� ������ � ���������� ���-�� ���� � ������.
//2. ����� ��������� ������ � ��������� ���� �� � ������ �����-���������. ����
//���� ���������� true, ���� ��� false
public class TextFormater {
    public static int words(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        return stringTokenizer.countTokens();
    }

    public static boolean ifPalindrome(String str) {
        boolean checker=false;
        for (String retval : str.split(" ")) {
            String word=retval.toLowerCase();
            StringBuilder original=new StringBuilder(word);
            StringBuilder reverse= original.reverse();
            if(reverse.toString().equals(word)){
                checker=true;
                break;
            }
        }
        return checker;
    }
}
