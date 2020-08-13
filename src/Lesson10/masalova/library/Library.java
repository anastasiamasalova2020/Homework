package Lesson10.masalova.library;

import java.util.*;

//Создать класс Библиотека, поля:
//• Список книг (изначально пустой) методы:
//• добавить книгу (принимает объект книги и добавляет его в список товаров). При попытке добавить кигу с id уже
//  существующем в списке, вставка производится не должна
//• получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке)
//• удалить книгу (метод принимает id книги и удаляет из списка книгу с соответствующим id)
//• редактировать книгу (принимает объект книги и редактирует их список товаров) Обратите внимание что id книги и индекс
// книги в списке — это разные вещи, не перепутайте. Id книги — это поле вашего объекта, вы при его создании его задаете.
//  А индекс книги в списке книг, это по сути её порядковый номер в списке(начинается с 0).
public class Library {
    protected static List<Book> library;

    public Library() {
        library = new ArrayList<>();
        Book AroundTheWord = new Book(1001, "Вокруг света за 80 дней", "Приключения");
        Book HarryPotter = new Book(1002, "Гарри Поттер", "Фэнтази");
        Book MonteCrista = new Book(1003, "Граф Монте Криста", "Приключения");
        Book WarAndPeace = new Book(1004, "Война и мир","Роман");
        Book DeadSouls = new Book(1006, "Мёртвые души", "Поэма");

        library.add(HarryPotter);
        library.add(MonteCrista);
        library.add(WarAndPeace);
        library.add(DeadSouls);
        library.add(AroundTheWord);
    }

    public boolean add(Book book) {//добавление книги
        int k = 0;
        for (Book value : library) {
            if (value.getId() == book.getId()) {
                k = 1;
                break;
            }
        }
        if (k == 0) {
            library.add(book);
            System.out.println("Книга успешно добавлена.");
            return true;
        } else {
            System.out.println("ОШИБКА: книга не может быть добавленна, потому что книга с таким ID уже есть!");
            return false;
        }
    }

    public List<Book> showBooks() {
        return library;
    }


    public void remove(int id) {//удаление книги
        int k = -1;
        for (int i = 0; i < library.size(); i++) {

            if (library.get(i).getId() == id) {
                k = i;
                break;
            }
        }
        if (k != -1) {
            library.remove(library.get(k));
            System.out.println("Книга успешно удалена.");
        } else {
            System.out.println("ОШИБКА: книги с таким ID не существует в библиотеке ");
        }
    }

    public void redactor(int id, String new_title, String new_genre) {//ставит переданную книгу на последнее место в ArrayList

        int k = 0;
        for (Book value : library) {
            if (value.getId() == id) {
                k = 1;
                value.setTitle(new_title);
                value.setGenre(new_genre);
                System.out.println("Книга успешно отредактирована. Ваша книга: "+value.toString());
            }
        }
        if (k == 0) {
            System.out.println("ОШИБКА: книги с таким ID не существует в библиотеке ");
        }
    }

}
