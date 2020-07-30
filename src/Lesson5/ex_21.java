package Lesson5;//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

public class ex_21 {
    public static void main(String[] args) {
        String str = new String("ха ");
        String addS = new String("хи ");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            str += addS;
        }
        System.out.println("\n"+str);
        long endTime = System.currentTimeMillis();
        System.out.println("Цикл с использованием String занял " + (endTime - startTime) + " миллисекунд.");


        StringBuilder str2 = new StringBuilder("ха ");
        StringBuilder addS2 = new StringBuilder("хи ");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            str2.append(addS2);
        }
        System.out.println("\n"+str2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Цикл с использованием StringBuilder занял " + (endTime2 - startTime2) + " миллисекунд");


        StringBuffer str3 = new StringBuffer("ха ");
        StringBuffer addS3 = new StringBuffer("хи ");
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            str3.append(addS3);
        }
        System.out.println("\n"+str3);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Цикл с использованием StringBuffer занял " + (endTime3 - startTime3) + " миллисекунд");

        System.out.println("\nStringBuffer & StringBuilder занимают приблизительно одинаковое время и намного быстрее, чем String");
    }
}
