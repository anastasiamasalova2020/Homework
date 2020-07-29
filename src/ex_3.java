import java.util.Scanner;
/*
 Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
 Если нулевым, то заменить его на10. Вывести полученное число
*/
public class ex_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.print("New number is: ");
        if(number>0){
            System.out.println(++number);
        }
        else if (number==0){
            System.out.println(10);
        }
        else{
            number-=2;
            System.out.println(number);
        }
    }

}
