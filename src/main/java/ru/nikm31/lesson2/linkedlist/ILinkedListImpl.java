package ru.nikm31.lesson2.linkedlist;

import java.sql.SQLOutput;

public class ILinkedListImpl<E> implements ILinkedList<E> {

    private Node<E> firstElement;
    private Node<E> lastElement;
    private int size;

    @Override
    public void insertFirst(E value) {
        firstElement = new Node<>(value, firstElement);
        size++;
        if (size == 1) {
            lastElement = firstElement;
        }
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = firstElement;
        firstElement = removedNode.next;
        removedNode.next = null;
        size--;

        if (isEmpty()) {
            lastElement = null;
        }

        return removedNode.item;
    }

    @Override
    public void insertLast(E value) {
        Node<E> newNode = new Node<>(value, null);

        if (isEmpty()) {
            insertFirst(value);
            return;
        }

        lastElement.next = newNode;
        lastElement = newNode;
        size++;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        Node<E> previous = null;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if (current == firstElement) {
            removeFirst();
            return true;
        } else if (current == lastElement) {
            lastElement = previous;
            previous.next = null;
        } else {
            previous.next = current.next;
        }

        current.next = null;
        size--;

        return true;
    }

    @Override
    public boolean contains(E value) {
        Node<E> current = firstElement;
        while (current != null) {
            if (current.item.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        Node<E> current = firstElement;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append(" -> ");
            }

            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public E getFirst() {
        return getValue(firstElement);
    }

    @Override
    public E getLast() {
        return getValue(lastElement);
    }

    private E getValue(Node<E> eNode) {
        return eNode != null ? eNode.item : null;
    }
}
