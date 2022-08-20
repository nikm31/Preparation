package ru.nikm31.lesson5.dao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.nikm31.lesson5.config.HibernateSessionFactoryUtil;
import ru.nikm31.lesson5.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    public Student findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public void save(Student user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(Student user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(Student user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public List<Student> findAll() {
        List<Student> users = (List<Student>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Student").list();
        return users;
    }

    public void saveAll(List<Student> students) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        for (Student s: students) {
            session.save(s);
        }

        tx1.commit();
        session.close();
    }
}
