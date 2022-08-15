package ru.nikm31.lesson1.oop;

public abstract class Figure {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void draw();

    public void hide() {
        System.out.println("Фигура скрыта: " + this.name);
    }

}
