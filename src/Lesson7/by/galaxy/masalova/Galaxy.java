package by.galaxy.masalova;

//В методе первым делом осуществляем предстартовую проверку переданного объекта, если она провалилась(метод вернул false) выводим сообщение «Предстартовая проверка провалена».
// Если проверка прошла успешно, то производим запуск двигателей(вызываем метод запуска двигателя).
//После этого производиться обратный отсчет (10 ..... 1).
//После обратного отсчета вызываем метод старт переданного объекта.
public class Galaxy {
    public static void launch(IStart iStart) {
        if (iStart.sysCheck()) {
            iStart.engineStart();
            System.out.println("Обратный отсчет:");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + "\t");
            }
            System.out.println();
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }

}
