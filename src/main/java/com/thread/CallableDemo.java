package com.thread;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "[Thread : " + Thread.currentThread().getName() + "] Hello World";
            }
        });
//        Future<String> future1 = executorService.submit(() -> "Hello World");
        String value = future.get();
        System.out.println(value);
        executorService.shutdown();
    }


}
