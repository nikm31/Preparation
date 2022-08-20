package ru.nikm31.lesson2;

import ru.nikm31.lesson2.arraylist.IArrayList;
import ru.nikm31.lesson2.arraylist.IArrayListImpl;
import ru.nikm31.lesson2.linkedlist.ILinkedList;
import ru.nikm31.lesson2.linkedlist.ILinkedListImpl;


import java.util.ArrayList;

public class MainAppLesson2 {

    public static void main(String[] args) {

        ILinkedList<Integer> list = new ILinkedListImpl<>();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(100);
        list.getFirst();
        list.getLast();
        list.removeFirst();
        list.remove(4);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.display();

        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);

        IArrayList<String> arrayList = new IArrayListImpl<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        arrayList.remove(10);
        arrayList.remove(9);

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.isEmpty());
        arrayList.display();

        isPalindrome(111);

    }

    public static boolean isPalindrome(int x) {
        String[] split = Integer.toString(x).split("");
        for (int i = 0, j = split.length-1; i < j; i++, j--) {
            if (!(split[i].equals(split[j]))) {
                return false;
            }
        }
        return true;
    }
}
