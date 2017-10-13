package com.thread;

/**
 * Java Thread/Runnable 模型
 */


public class ThreadMain {
    public static void main(String[] args) {
//        Thread thread = new Thread(() -> System.out.println("Hello World"));
        Thread thread = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                System.out.println("[Thread] Hello World..." + Thread.currentThread().getName());
            }
        }, "Sub");
        thread.start();
        System.out.println("[Thread] Starting..." + Thread.currentThread().getName());
    }


}
