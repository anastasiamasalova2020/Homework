//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня. Какойсуммарный путь пробежит спортсмен за 7 дней?
public class ex1 {
    public static void main(String[] args){
        double a=10;
        double s=10;
        for(int i=0;i<6;i++){
            a*=1.1;
            s+=a;
        }
        s = s * 1000;
        int i = (int) Math.round(s);
        s = (double)i / 1000;
        System.out.println("The whole distance is: "+s);
    }
}
