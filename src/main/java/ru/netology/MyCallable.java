package ru.netology;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Task> {


    @Override
    public Task call() throws Exception {
        int counter = 0;
        for (int i = 0; i < 10 + Math.round(10 * Math.random()); i++) {
            System.out.println(Thread.currentThread().getName() + ", with ID " + Thread.currentThread().getId() + " is working. Counter: " + counter);
            counter++;
            Thread.sleep(1000);
        }
        return new Task(counter, Thread.currentThread().getName(), Thread.currentThread().getId());
    }
}
