import java.util.Scanner;
/*Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.*/
public class ex_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number b: ");
        int b = scan.nextInt();
        System.out.print("Enter the third number c: ");
        int c = scan.nextInt();
        int k=0,r=0;//счетчики для ответа
        if(a>=0){
            k++;}
        else{ r++; }
        if(b>=0){
            k++;}
        else{ r++; }
        if(c>=0){
            k++;}
        else{ r++; }
        System.out.print("The amount of positive numbers in the set is "+k+"; the amount of negative numbers in the set is " +r+'.');
    }
}
