//полностью закрыть круглой картонкой радиусом r.
import java.util.Scanner;

public class ex_7m {
    public static void main(String[] args){
        System.out.println("Enter the first side of the rectangle a: ");
        Scanner scan=new Scanner(System.in);
        int a=  scan.nextInt();
        System.out.println("Enter the second side of the rectangle b: ");
        int b=  scan.nextInt();
        System.out.println("Enter the radius of the circle r: ");
        int r= scan.nextInt();
        scan.close();
        double diagonal= Math.sqrt(a*a+b*b);//для удовлетворения условия надо чтобы радиус был равен как минимум половине диагонали прям-ка.
        if(r>=diagonal/2)
        {
            System.out.println("It is possible to cover the rectangle with the circle.");
        }
        else
            {
                System.out.println("It is NOT possible to cover the rectangle with the circle.");
            }
    }
}
