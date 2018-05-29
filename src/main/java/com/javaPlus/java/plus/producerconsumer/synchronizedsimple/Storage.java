package com.javaPlus.java.plus.producerconsumer.synchronizedsimple;

import java.util.LinkedList;

/**
 * 生产者生产到缓冲区,消费者从缓冲区取数据消费
 * 如果缓冲区已满,则生产者阻塞
 * 如果缓冲区为空,则消费者阻塞
 */

public class Storage {

    //use synchronized,wait() and notify()

    //定义缓冲区的最大容量
    private final int MAX_SIZE = 100;

    //缓冲队列
    private LinkedList<Object> linkedList = new LinkedList<>();


    public synchronized void produce(String produce) {
        while (linkedList.size() == MAX_SIZE) {
            System.out.println("缓冲区已满,暂时不能执行生产任务");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();    //实际线上不建议此种处理异常的方式
            }
        }
        linkedList.add(new Object());   //增加一个任务到缓冲区
        System.out.println("生产了一个产品,缓冲区大小为:" + linkedList.size());
        linkedList.notifyAll();
}

    public void consume(String consumer) {
        synchronized (linkedList) {
            while (linkedList.size() == 0) {
                System.out.println("缓冲区为空,暂时不能执行消费任务");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkedList.remove();    //消费一个任务
            System.out.println("消费了一个产品,缓冲区大小为:" + linkedList.size());
            linkedList.notifyAll(); //唤醒其他线程
        }
    }

    public static void main(String[] args) {

    }
}
