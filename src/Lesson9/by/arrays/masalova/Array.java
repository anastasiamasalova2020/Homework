package Lesson9.by.arrays.masalova;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.
public class Array<E> {
    private E[] arr;

    public Array(E[] arr) {
        this.arr = arr;
    }

    public E getMember(int index) {
        return arr[index];
    }

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }
}
