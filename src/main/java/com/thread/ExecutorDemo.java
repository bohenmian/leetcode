package com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> System.out.println("[Thread] Hello World..." + Thread.currentThread().getName()));
        if (executor instanceof ExecutorService) {
            ExecutorService executorService = ExecutorService.class.cast(executor);
            executorService.shutdown();
        }
    }
}
