import java.util.Scanner;

public class ex_12m {
    public static void main(String[] args) {
        System.out.println("Enter the number n: ");
        Scanner scan=new Scanner(System.in);
        int n=  scan.nextInt();
        scan.close();
        int i=1,sum=0;
        //Скорее всего имелось ввиду сумма первых n натуральных чисел, потому что иначе целые числа уходят на - ∞
        while (n>0) {
            if(i%3==0){sum+=i;n--;}
            i++;
        }
        System.out.println("The total sum of 5 numbers is "+sum+'.');
    }
}
