package Lesson6.by.masalova.computer;
//Создать класс компьютер.
//Поля:
//- процессор
//- оперативка
//- жесткий диск
//- ресурс полных циклов работы (включений/выключений)

//Методы:
//- метод описание(вывод всех полей)
//- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает. Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
//- выключить (аналогично включению)
//- при превышении лимита ресурса комп сгорает
public class computer {


    private int processor;//разрядность.
    private int operativeMemory;//объем ОП.
    private String hDisk;//тип диска, например:SSD,HDD или SSHD.
    private static int resource;//лимит полных включений/выключений.
    private static int counter=0;//счетчик жизненного цикла: после удачного вклучения и выкулючения увеличивается на 1.
    private static int checker=0;//для проверки

    public static void switchOn(int n1) {//включение
        int a = (int) (Math.random() * 2);
        System.out.println("The generated number a: "+a);
        if (n1 == a ) {
            System.out.println("You are right! The computer begins its work! ");
        } else {
            System.out.println("The computer is burned out! The end!");
            computer.checker = 1;
        }
    }

    public static void switchOff(int n2) {//выключение
        int a = (int) (Math.random() * 2);
        System.out.println("The generated number a: "+a);
        if (n2 == a && computer.if_Burn()) {
            System.out.println("You are right! The computer ends its work! ");
            computer.counter++;
        } else {
            System.out.println("The computer is burned out! The end!");
            computer.checker = 1;
        }
    }

    public static boolean if_Burn() {//проверка на сгораемость
        return (counter <= resource) && (checker == 0);
    }

    public String toString() {
        return "This computer {" +
                "processor's dimension= " + processor +
                " bits, operative memory= " + operativeMemory + " gigabytes, hard disk's type- " + hDisk + ", the limit of full cycle lives: " + resource +
                '}';
    }


    public void setProcessor(int processor) {
        processor = processor;
    }

    public int getProcessor() {
        return processor;
    }

    public void setOperativeMemory(int operativeMemory) {
        operativeMemory = operativeMemory;
    }

    public int getOperativeMemory() {
        return operativeMemory;
    }


    public void setHDisk(String hDisk) {
        this.hDisk = hDisk;
    }

    public String getHDisk() {
        return hDisk;
    }

    public void setResource(int resource) {
        resource = resource;
    }

    public int getResource() {
        return resource;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        computer.counter = counter;
    }

    public int getChecker() {
        return checker;
    }

    public void setChecker(int checker) {
        computer.checker = checker;
    }
}

