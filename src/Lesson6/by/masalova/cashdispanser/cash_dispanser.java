package Lesson6.by.masalova.cashdispanser;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр.
public class cash_dispanser {
    private int n20;//количество купюр номиналом 20
    private int n50;//количество купюр номиналом 50
    private int n100;//количество купюр номиналом 100

    public cash_dispanser(int n20, int n50, int n100) {
        this.n20 = n20;
        this.n50 = n50;
        this.n100 = n100;
        System.out.println("\nThe initial situation with money: "+ this.n20 + " of 20s sheets, " + this.n50 +" of 50s sheets and" + this.n100 +" of 100s.");
    }

    public void AddMoney(int n20, int n50, int n100) {//добавление купюр
        this.n20 += n20;
        this.n50 += n50;
        this.n100 += n100;
        System.out.println("\nThe added money: " + n20 + " of 20s sheets, " + n50 + " of 50s sheets and " + n100 + " of 100s.");
        System.out.println("The current situation after adding: " + this.n20 + " of 20s sheets, " + this.n50 + " of 50s sheets and " + this.n100 + " of 100s.");
    }

    public boolean WithdrawMoney(int sum) {//снятие купюр
        boolean b=false;
        for (int i = 0; i <= n100; i++) {
            for (int j = 0; j <= n50; j++) {
                for (int k = 0; k <= n20; k++) {
                    if (i * 100 + j * 50 + k * 20 == sum) {
                        System.out.println("\nThe removed money: "  + k + " sheets of 20s, "+ j + " sheets of 50s and "+ i + " sheets of 100s.");
                        this.n100 -= i;
                        this.n50 -= j;
                        this.n20 -= k;
                        System.out.println("The current situation after removing money:" + this.n20 + " of 20s sheets," + this.n50 + " of 50s sheets and " + this.n100 + " of 100s.");
                        b = true;
                    }
                    if (b) {
                        break;
                    }
                }
                if (b) {
                    break;
                }
            }
            if (b) {
                break;
            }
        }
        System.out.println();
        return b;

    }


    public int getN20() {
        return n20;
    }

    public void setN20(int n20) {
        this.n20 = n20;
    }

    public int getN50() {
        return n50;
    }

    public void setN50(int n50) {
        this.n50 = n50;
    }

    public int getN100() {
        return n100;
    }

    public void setN100(int n100) {
        this.n100 = n100;
    }
}
