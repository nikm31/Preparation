package ru.nikm31.lesson1.oop;

public class Square extends Figure {

    @Override
    public void draw() {
        System.out.println("Рисуем: " + super.getName());
    }

    @Override
    public String toString() {
        return "Square name: " + super.getName();
    }
}
