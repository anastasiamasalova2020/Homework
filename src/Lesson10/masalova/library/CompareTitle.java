package Lesson10.masalova.library;

import java.util.Comparator;

class CompareTitle implements Comparator<Book> {
    //класс для сортировки книг по названию
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
