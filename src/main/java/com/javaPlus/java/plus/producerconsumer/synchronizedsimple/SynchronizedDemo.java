package com.javaPlus.java.plus.producerconsumer.synchronizedsimple;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Storage storage = new Storage();
        new Thread(new Producer(storage)).start();
        new Thread(new Producer(storage)).start();
        new Thread(new Consumer(storage)).start();
        new Thread(new Producer(storage)).start();

        new Thread(new Consumer(storage)).start();
        new Thread(new Consumer(storage)).start();
        new Thread(new Consumer(storage)).start();

    }
}
