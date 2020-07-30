//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.


//import java.util.Random;


public class ex_8m {
    public static void main(String[] args) {
        //представление для просто рандома:
        //Random rand =new Random();
        //int x = rand.nextInt();


        //мне кажется лучше через Math.random, потому что я не слышала про отрицательные рубли:)

        int x= (int) (Math.random()*10000+1);//в диапазоне от 1 до 10000 рублей



        int f=x%10;
        int r=x%100;
        if(r>10 & r<15){System.out.print(x + " рублей.");}
        else {
            switch(f){
                case 1:{System.out.print(x + " рубль."); break;}
                case 2:
                case 3:
                case 4:
                {System.out.print(x + " рубля.");break;}
                default:
                {System.out.print(x + " рублей.");}
            }
        }
    }
}
