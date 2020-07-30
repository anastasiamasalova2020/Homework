import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args){
        System.out.println("Enter the first number A: ");
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println("Enter the second number B: ");
        int B=sc.nextInt();
        sc.close();
        int result = 0;
        if(A>B)
        {
        for(int i=0;i<Math.abs(B);i++)
            {
            result+=A;
            }
        }

        else
            {
                for (int i = 0; i < Math.abs(A); i++)
                {
                    result += B;

                }
            }
        if((A<0)||(B<0)){result*=-1;}
        System.out.println("The result of A*B= "+result);
    }
}
