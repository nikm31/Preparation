package ru.nikm31.lesson2.arraylist;

public interface IArrayList<E> {

    boolean isEmpty();

    int size();

    E get(int index);

    void add(E element);

    boolean remove(int index);

    void display();

}
