/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
*/
import java.util.Scanner;
public class ex_5m{
    public static void main (String [] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a four-digit number x: ");
        int x = in.nextInt();
        int a1=x%10;
        x/=10;
        int a2=x%10;
        x/=10;
        int a3=x%10;
        x/=10;
        int a4=x;
        if(a1!=a2 & a1!=a3 &a1!=a4 & a2!=a3 & a3!=a4 & a2!=a4){
            System.out.println("All numerals are different.");}
        else{
            System.out.println("Some of the numerals are equal.");}
    }
}