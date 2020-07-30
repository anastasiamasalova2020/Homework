/*В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
*/
import java.util.Scanner;
public class ex_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of programmers: ");
        int a = scan.nextInt();
        int f=a%10;
        int r=a%100;
        if(r>10 & r<15){System.out.print(a + " программистов.");}
        else {
            switch(f){
                case 1:{System.out.print(a + " программист."); break;}
                case 2:
                case 3:
                case 4:
                {System.out.print(a + " программиста.");break;}
                default:
                {System.out.print(a + " программистов.");}
            }
        }
    }
}
