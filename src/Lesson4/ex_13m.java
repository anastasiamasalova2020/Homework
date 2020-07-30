//из них.
import java.util.Scanner;

public class ex_13m {
    public static void main(String[] args) {
        System.out.println("Enter the number of the last member of the sequence n: ");
        Scanner scan=new Scanner(System.in);
        int n=  scan.nextInt();
        scan.close();
        int array[] = new int[n];
        System.out.println("\n" +
                "Generated sequence: ");
        for(int i=0;i<n;i++){
            array[i]= (int) (Math.random()*100+2);
            System.out.print(array[i]+"\t");
        }
        int max=array[0];
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println();
        System.out.println("\n"+"The maximum is "+max);
    }
}
