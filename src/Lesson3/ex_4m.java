/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/
import java.util.Scanner;
public class ex_4m{
    public static void main (String [] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a four-digit number x: ");
        int x = in.nextInt();
        int y=0,k,f=1000;
        for(int i=0;i<=3;i++)
        {
            k=(x%10)*f;
            y+=k;
            x/=10;
            f/=10;
        }
        System.out.println("The new number:= "+y);
    }
}