package ru.nikm31.lesson3;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainAppLesson3 {
    private final static ExecutorService es = Executors.newFixedThreadPool(5);
    private final static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) throws InterruptedException {
        pingPong();

        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            es.execute(() -> {
                readWriteLock.writeLock().lock();
                counter.sum();
                counter.showCount();
                readWriteLock.writeLock().unlock();
            });
        }
        es.shutdown();
    }

    private static void pingPong() throws InterruptedException {
        Thread thread1;
        Thread thread2;
        for (int i = 0; i < 100; i++) {
            thread1 = new Thread(MainAppLesson3::printPing);
            thread2 = new Thread(MainAppLesson3::printPong);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        }
    }

    private static void printPing() {
        System.out.println("ping - " + " Thread ID: " + Thread.currentThread().getId());
    }

    private static void printPong() {
        System.out.println("pong - " + " Thread ID: " + Thread.currentThread().getId());
    }
}
