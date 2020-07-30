//ли его последняя цифра семеркой. Определите, является ли число четным.
import java.util.Scanner;

public class ex_6m{
    public static void main(String[] args){
        System.out.println("Enter the number A: ");
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        sc.close();
        if(A>=100 & A<=999)
        {
            System.out.println("The number "+A+" is three-digit. ");
        }
        else
        {
            System.out.println("The number "+A+" is NOT three-digit. ");
        }
        if(A%10==7)
        {
            System.out.println("The last numeral of "+A+" is 7. ");
        }
        else
        {
            System.out.println("The last numeral of "+A+" is NOT 7. ");
        }
        if(A%2==0)
        {
            System.out.println("The number "+A+" is even. ");
        }
        else
        {
            System.out.println("The number "+A+" is odd. ");
        }
}
}