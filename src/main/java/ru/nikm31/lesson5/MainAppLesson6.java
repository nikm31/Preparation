package ru.nikm31.lesson5;

import org.apache.commons.lang.RandomStringUtils;
import ru.nikm31.lesson5.controller.StudentController;
import ru.nikm31.lesson5.entity.Student;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainAppLesson6 {
    private final static String ALL_SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    private final static int NAME_LENGTH = 8;

    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        // save
        Student student = new Student();
        student.setName("nik");
        student.setMark(5);
        studentController.saveUser(student);

        // update
        studentController.updateUser(student);
        student.setName("Nik");
        student.setMark(5);
        studentController.updateUser(student);

        // find all
        studentController.findAllUsers().forEach(System.out::println);

        // find by id
        System.out.println(studentController.findUser(1L));

        // delete
        studentController.deleteUser(student);

        // generating students
        List<Student> students = new ArrayList<>();
        Random random = new SecureRandom();

        for (int i = 0; i < 1000; i++) {
            Student s = new Student();
            s.setName(RandomStringUtils.random(NAME_LENGTH, ALL_SYMBOLS.toCharArray()));
            s.setMark(random.nextInt(5));
            students.add(s);
        }

        // fast save 1000 students
        long startFast = System.currentTimeMillis();
        studentController.saveAll(students);
        long endFast = System.currentTimeMillis() - startFast;

        // slow save 1000 students
        long startSlow = System.currentTimeMillis();
        for (Student st: students) {
            studentController.saveUser(st);
        }
        long endSlow = System.currentTimeMillis() - startSlow;

        System.out.println("Fast save: " + endFast);
        System.out.println("Slow save: " + endSlow);
    }
}
