package ru.nikm31.lesson1.fixing;

public class LightWeightCar extends Car {

    public LightWeightCar(IEngine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    public void move() {
        super.getEngine().move();
    }


    public void stop() {
        super.getEngine().stop();
    }


    public void start() {
        super.getEngine().start();
    }



}

