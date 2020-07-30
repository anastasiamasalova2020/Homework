// Даны 2 числа. Вывести большее из них
import java.util.Scanner;
public class ex_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number b: ");
        int b = scan.nextInt();
        if (a > b) {
            System.out.print("The biggest number is " + a + '.');
        } else
        if (b > a) {
            System.out.print("The biggest number is " + b + '.');
        } else {
            System.out.print("Two numbers are equal.");
        }
    }

}
