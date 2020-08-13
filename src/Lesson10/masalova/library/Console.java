package Lesson10.masalova.library;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//• Выберите действие:
//
//◦ Вывод всех книг. При выборе этого действия, было бы отлично спросить у пользователя в какой сортировке вывести:
//▪ по алфавиту (возрастание)
//▪ по алфавиту (убывание)
//▪ по добавлению(сначала новые, потом более старые)
//После выбора сортировки, из библиотки получаете список книг, сортируете их таким образом как выбрал пользователь и выводите в консоль.
//
//◦ Добавление книги. При выборе этого действия:
//▪ пользователь должен ввести из консоли 3 параметра (id, название, жанр).
//▪ создаем объект книги (поля заполняются данными введенными пользователем)
//▪ добавляем книгу в библиотеку (напоминаю, если в списке книг уже существует книга с таким id, то новая книга не добавляется)
//
//◦ Удаление книги. При выборе этого действия:
//▪ пользователь вводит id книги которую нужно удалить
//▪ удаляем книгу из магазина
//
//◦ Редактирование книги. При выборе этого действия:
//▪ пользователь должен ввести из консоли 3 параметра (id книги для редактирования, новое название, новую жанр).
//▪ создаем объект книги (поля заполняются данными введенными пользователем)
//▪ редактируем книгу в библиотеке
//
//◦ Выход. При выборе этого действия, работа библиотеки завершается.

public class Console {


    Library bookShelf = new Library();
    Scanner sc = new Scanner(System.in);
    private int result = 1;

    public void choice() {

        int ch = 0;
        while (ch != 1) {
            System.out.println("Выберите действие:\na) вывод всех книг и их сортировка\nб) добавление книги\nв) удаление книги\nг) редактирование книги\nд) выход");
            String choice = sc.nextLine();
            switch (choice) {
                case "а" -> {
                    sortBy();
                    ch = 1;
                }
                case "б" -> {
                    addBook();
                    ch = 1;
                }
                case "в" -> {
                    removeBook();
                    ch = 1;
                }
                case "г" -> {
                    redactBook();
                    ch = 1;
                }
                case "д" -> {
                    if (exit()) {
                        setResult(0);
                    }
                    ch = 1;
                }
                default -> System.out.println("ОШИБКА: Вы ввели неверную букву, проверте язык(должен быть русский) и регистр.");
            }
            sc.nextLine();
        }
    }

    public void sortBy() {
        System.out.println("Вы выбрали опцию-сортировка библиотеки.");

        CompareTitle compareTitle = new CompareTitle();
        int ch = 0;
        while (ch != 1) {
            System.out.println("Выберите как вы хотите отсортировать библиотеку:\nа) по алфавиту(возврастанию)\nб) по алфавиту(убыванию)\nв) по добавлению(сначала более новые, потом более старые)\nВведите только букву Вашего выбора:");
            String choice = sc.nextLine();
            switch (choice) {
                case "а" -> {
                    bookShelf.showBooks().sort(compareTitle);
                    System.out.println(bookShelf.showBooks());
                    ch = 1;
                }
                case "б" -> {
                    bookShelf.showBooks().sort(compareTitle);
                    Collections.reverse(bookShelf.showBooks());
                    System.out.println(bookShelf.showBooks());
                    ch = 1;
                }
                case "в" -> {
                    Collections.reverse(bookShelf.showBooks());
                    System.out.println(bookShelf.showBooks());
                    ch = 1;
                }
                default -> System.out.println("ОШИБКА: Вы ввели неверную букву, проверте язык(должен быть русский) и регистр.");
            }
        }
    }

    public void addBook() {

        System.out.println("Вы выбрали опцию-добавление книги в библиотеку.\nВведите параметры Вашей книги");
        System.out.print("ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Название:");
        String title = sc.nextLine();
        System.out.print("Жанр:");
        String genre = sc.nextLine();
        Book book = new Book(id, title, genre);
        System.out.println("Ваша новая книга: " + book.toString());
        bookShelf.add(book);
    }

    public void removeBook() {
        System.out.println("Вы выбрали опцию-удаление книги из библиотеку.\nВведите id книги, которую Вы хотите удалить:");
        int id = sc.nextInt();
        bookShelf.remove(id);
    }

    public void redactBook() {
        System.out.println("Вы выбрали опцию-редактирование книги.\nВведите параметры Вашей книги");
        System.out.print("ID книги для редактирования:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Новое название:");
        String title = sc.nextLine();
        System.out.print("Новый жанр:");
        String genre = sc.nextLine();
        bookShelf.redactor(id, title, genre);
    }

    public boolean exit() {
        int ch = 0;
        boolean result = false;
        while (ch != 1) {
            System.out.println("Вы действительно хотите выйти из библиотеки? Введите + либо - ");
            String choice = sc.nextLine();
            switch (choice) {
                case "+" -> {
                    result = true;
                    ch = 1;
                    System.out.println("Спасибо за посещение!");
                }
                case "-" -> {
                    ch = 1;
                }

                default -> System.out.println("ОШИБКА: Вы верный знак");
            }
        }
        return result;
    }

    public void start() {
        do {
            choice();
        } while (getResult() != 0);
        System.exit(0);
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
