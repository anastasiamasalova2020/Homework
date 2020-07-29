/*Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей. Определить существует ли такой треугольник.
Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
Если хотя бы в одном случае отрезококажется больше суммы двух других, то треугольника с такими сторонами несуществует.*/

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side a: ");
        int a = scan.nextInt();
        System.out.print("Enter the second side b: ");
        int b = scan.nextInt();
        System.out.print("Enter the third side c: ");
        int c = scan.nextInt();
        if (a + b > c & b + c > a & a + c > b) {
            System.out.print("The triangle with sides a,b and c exists. ");
        } else {
            System.out.print("The triangle with sides a,b and c doesn't exist. ");
        }

    }
}
