package com.javaPlus.java.plus.producerconsumer.synchronizedsimple;

public class Producer extends Thread {

    private String produce;

    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        this.produce(produce);
    }

    public void produce(String produce) {
        storage.produce(produce);
    }

    private String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
