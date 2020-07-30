import java.util.Scanner;
/*
Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.
 */
public class ex_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number b: ");
        int b = scan.nextInt();
        System.out.print("Enter the third number c: ");
        int c = scan.nextInt();
        int k=0;
        if(a>0){
            k++;}
        if(b>0){
            k++;}
        if(c>0){
            k++;}
        System.out.print("The amount of positive numbers in the set is "+k);
    }

}