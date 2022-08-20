package ru.nikm31.lesson5.service;

import ru.nikm31.lesson5.entity.Student;

import java.util.List;

public interface StudentService {
    Student findUser(Long id);

    void saveUser(Student user);

    void deleteUser(Student user);

    void updateUser(Student user);

    List<Student> findAllUsers();

    void saveAll(List<Student> students);
}
