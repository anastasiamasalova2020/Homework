//Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class ex5 {
    public static void main(String[] args) {
        int h=1;
        System.out.println(" _______________ ");
        System.out.println("| Д |     См    |");
        System.out.println("|___|___________|");
        while(h<=20){
         System.out.print("|"+h+"\t"+"|"+"\t");
         double k=h*2.54;
         System.out.println(k+"\t"+"|");
         h++;
            System.out.println("|___|___________|");
    }
}
}
