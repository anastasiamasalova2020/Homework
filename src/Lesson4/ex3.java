//Вычислить: 1+2+4+8+...+256
public class ex3 {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=256){
            sum+=i;
            i*=2;
        }
        System.out.println("The total sum is: "+sum);
    }
}
