import java.util.Scanner;
public class ex_1 {
    public static void main(String[] args){
        System.out.print("Enter rhe number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int k=1;//счетчик для количества
        if(number>=0){
            System.out.print("The number is positive ");
        }
        else{
            System.out.print("The number is negative ");
        }
        while(Math.abs(number)>=10){
            k++;
            number/=10;
        }
        System.out.println("and the has "+k+" numeral(s).");
    }
}