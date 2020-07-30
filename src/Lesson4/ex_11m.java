//делится без остатка только на 1 и себя.
import java.util.Scanner;

public class ex_11m {
    public static void main(String[] args) {
        System.out.println("Enter the number x: ");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.close();
        int k=0;
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                k=1;
            }
        }
        if(k==0) { System.out.println(x+" is prime"); }
        else{ System.out.println(x+" is composite"); }
    }
}
