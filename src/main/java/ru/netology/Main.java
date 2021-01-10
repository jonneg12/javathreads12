package ru.netology;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final ExecutorService threadPool = Executors.newFixedThreadPool(4);

        List<MyCallable> myCallables = new ArrayList<>();

        //task with invokeAll()
        System.out.println("Invoke all.");
        for (int i = 0; i < 4; i++) {
            MyCallable mc = new MyCallable();
            myCallables.add(mc);
        }

        List<Future<Task>> futures = threadPool.invokeAll(myCallables);

        for (Future<Task> future : futures) {
            System.out.println("Messages: " + future.get().getNumberOfMessages() + ". Thread name: " + future.get().getThreadName());
        }

        myCallables.clear();

        //task with invokeAny()
        System.out.println();
        System.out.println("Invoke any.");
        for (int i = 0; i < 4; i++) {
            MyCallable mc = new MyCallable();
            myCallables.add(mc);
        }

        Task fastestTask = threadPool.invokeAny(myCallables);
        System.out.println("Number of messages fastest task: " + fastestTask.getNumberOfMessages() + ". Thread name: " + fastestTask.getThreadName());
        threadPool.shutdown();
    }
}
