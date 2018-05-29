package com.javaPlus.java.plus.producerconsumer.synchronizedsimple;

public class Consumer extends Thread {

    private String consumer;

    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        this.consumer(consumer);
    }

    private void consumer(String consumer) {
        storage.consume(consumer);
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
