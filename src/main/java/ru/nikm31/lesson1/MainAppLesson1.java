package ru.nikm31.lesson1;


import ru.nikm31.lesson1.builder.Person;
import ru.nikm31.lesson1.fixing.Car;
import ru.nikm31.lesson1.fixing.SuperEngine;
import ru.nikm31.lesson1.fixing.LightWeightCar;
import ru.nikm31.lesson1.fixing.Lorry;
import ru.nikm31.lesson1.oop.Circle;
import ru.nikm31.lesson1.oop.Figure;
import ru.nikm31.lesson1.oop.Square;
import ru.nikm31.lesson1.oop.Triangle;

import java.util.ArrayList;

public class MainAppLesson1 {

    public static void main(String[] args) {


        Person person = Person.builder()
                .setGender("male")
                .setAge(99)
                .setPhone("79040000000")
                .setFirstName("Nikolay")
                .setLastName("Matvienko")
                .setMiddleName("Sergeevich")
                .setAddress("Moscow, Tverskaya str")
                .setCountry("Russia")
                .build();

        System.out.println(person);

        Figure circle = new Circle();
        Figure square = new Square();
        Figure triangle = new Triangle();

        circle.setName("super Circle");
        circle.draw();
        circle.hide();

        square.setName("super Square");
        square.draw();
        square.hide();

        triangle.setName("super Triangle");
        triangle.draw();
        triangle.hide();

        Car myCar = new LightWeightCar(new SuperEngine(), "black", "BMW");

        Lorry lorry = new Lorry();
        lorry.setCar(myCar);

        lorry.open();
        lorry.start();
        lorry.move();
        lorry.stop();
    }
}
