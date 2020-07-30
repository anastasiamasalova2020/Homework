//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class ex2 {
    public static void main(String[] args){
        int hours=3;
        int amoeba=1;
        while (hours<=24){
             amoeba*=2;
             hours+=3;
        }
        System.out.println("The total number of  amoeba is: "+ amoeba);
    }
}
