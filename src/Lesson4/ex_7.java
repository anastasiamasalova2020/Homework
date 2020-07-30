//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class ex_7 {
    public static void main(String[] args){
        int a=1,sum=0;
        while(a<99){
            sum+=a;
            a+=2;
        }
        System.out.println("The total sum is: "+sum);
    }
}
