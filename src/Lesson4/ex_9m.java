//произведение, т.е. факториал числа.

/* надо изменить:
double averageSum = 0;
double sum = 0;
int n = 0;
int x = (int)(Math.random() * 20);
while(x != 0) {
sum += x;
n ++;
x = (int)(Math.random()*20);
}
if(n != 0){
averageSum = sum / n;
} else {
averageSum = 0;
}
System.out.println("среднее:" + averageSum);
*/
public class ex_9m {
    public static void main(String[] args){
        int x = (int)(Math.random() * 20);
        long factor=1;
        int r=1;
        while (r<=x){
            factor*=r;
            r++;
        }
        System.out.println("Факториал числа " + x+" равен "+factor);
    }
}
