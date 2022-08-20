package ru.nikm31.lesson5.service;

import ru.nikm31.lesson5.entity.Student;
import ru.nikm31.lesson5.dao.StudentDao;
import ru.nikm31.lesson5.dao.StudentDaoImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentDao studentRepository = new StudentDaoImpl();

    @Override
    public Student findUser(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void saveUser(Student user) {
        studentRepository.save(user);
    }

    @Override
    public void deleteUser(Student user) {
        studentRepository.delete(user);
    }

    @Override
    public void updateUser(Student user) {
        studentRepository.update(user);
    }

    @Override
    public List<Student> findAllUsers() {
        return studentRepository.findAll();
    }

    @Override
    public void saveAll(List<Student> students) {
        studentRepository.saveAll(students);
    }
}
