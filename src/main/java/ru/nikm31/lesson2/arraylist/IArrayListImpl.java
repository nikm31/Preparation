package ru.nikm31.lesson2.arraylist;

import java.util.Arrays;

public class IArrayListImpl<E> implements IArrayList<E> {

    private int size;

    private final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public IArrayListImpl() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private void grow() {
        if ((size + 1) > DEFAULT_CAPACITY) {
            E[] old = elements;
            int oldSize = size;
            elements = Arrays.copyOf(old, ++oldSize);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void add(E element) {
        grow();
        elements[size++] = element;
    }

    @Override
    public boolean remove(int index) {
        if (size == 0 || index > elements.length) {
            return false;
        } else if ((get(index)) == null) {
            return false;
        } else {
            elements[index] = null;
            if (elements.length > DEFAULT_CAPACITY) {
                E[] old = (E[]) new Object[elements.length - 1];
                int idx = 0;
                for (int i = 0; i < elements.length; i++) {
                    if (i != index) {
                        old[idx++] = elements[i];
                    }
                }
                elements = old;
            }
        }

        return true;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i]);
            if (i == elements.length - 1) {
                break;
            }
            if ((elements.length - 1) != i) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
