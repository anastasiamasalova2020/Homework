// Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
public class ex_10m
{
    public static void main(String[] args) {
        int x = (int) (Math.random() * 5 + 10);
        int p=1;
        long result=1;
        while(p<=x){
            result*=p;
            p++;
        }
        System.out.println("The factorial of "+x+" is "+result);
    }
}
