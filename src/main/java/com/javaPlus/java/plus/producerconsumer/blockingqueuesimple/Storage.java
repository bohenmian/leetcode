package com.javaPlus.java.plus.producerconsumer.blockingqueuesimple;

import java.util.concurrent.LinkedBlockingQueue;

public class Storage {

    private final int MAX_SIZE = 100;

    private LinkedBlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<>();

    public void produce() {
        if (blockingQueue.size() == MAX_SIZE) {
            System.out.println("缓冲区已满,暂时不能处理生产任务");
        }
        try {
            blockingQueue.put(new Object());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产一个任务,缓冲区大小为" + blockingQueue.size());
    }

    public void consumer() {
        if (blockingQueue.size() == 0) {
            System.out.println("缓冲区为空,暂时不能处理消费任务");
        }
        try {
            blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费一个任务,缓冲区大小为" + blockingQueue.size());
    }
}
