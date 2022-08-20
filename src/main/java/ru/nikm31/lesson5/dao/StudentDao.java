package ru.nikm31.lesson5.dao;

import ru.nikm31.lesson5.entity.Student;

import java.util.List;

public interface StudentDao {
    Student findById(Long id);

    void save(Student user);
    void update(Student user);

    void delete(Student user);

    List<Student> findAll();

    void saveAll(List<Student> students);
}
