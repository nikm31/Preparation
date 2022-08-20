package ru.nikm31.lesson5.controller;

import ru.nikm31.lesson5.entity.Student;
import ru.nikm31.lesson5.service.StudentService;
import ru.nikm31.lesson5.service.StudentServiceImpl;

import java.util.List;

public class StudentController {

    private final StudentService studentService = new StudentServiceImpl();

    public Student findUser(Long id) {
        return studentService.findUser(id);
    }

    public void saveUser(Student user) {
        studentService.saveUser(user);
    }

    public void deleteUser(Student user) {
        studentService.deleteUser(user);
    }

    public void updateUser(Student user) {
        studentService.updateUser(user);
    }

    public List<Student> findAllUsers() {
        return studentService.findAllUsers();
    }

    public void saveAll(List<Student> students) {
        studentService.saveAll(students);
    }
}
