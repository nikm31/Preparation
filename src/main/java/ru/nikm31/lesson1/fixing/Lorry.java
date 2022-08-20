package ru.nikm31.lesson1.fixing;

public class Lorry {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void open() {
        System.out.println("Car is open");
    }


    public void move() {
        car.getEngine().move();
    }


    public void stop() {
        car.getEngine().stop();
    }


    public void start() {
        car.getEngine().start();
    }
}

