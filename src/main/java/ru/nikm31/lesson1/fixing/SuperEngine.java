package ru.nikm31.lesson1.fixing;

public class SuperEngine implements IEngine {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking engine");
    }
}
