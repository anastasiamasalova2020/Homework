package Lesson12;

import java.util.StringTokenizer;

//1. ћетод принимает строку и возвращает кол-во слов в строке.
//2. ћетод принимает строку и провер€ет есть ли в строке слово-палиндром. ≈сли
//есть возвращает true, если нет false
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
