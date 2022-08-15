package ru.nikm31.lesson3;

public class Counter {
    private int count;

    public void sum() {
        this.count++;
    }

    public void divide() {
        this.count--;
    }

    public void showCount() {
        System.out.println(this.count);
    }
}
