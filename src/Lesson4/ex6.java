//Напишите программу вывода всех четных чисел от 2 до 100 включительно
public class ex6 {
    public static void main(String[] args){
        int a=2;
        while(a<=100){
            System.out.print(a+" \t");
            if(a%20==0){System.out.println();}
            a+=2;
        }
    }
}
