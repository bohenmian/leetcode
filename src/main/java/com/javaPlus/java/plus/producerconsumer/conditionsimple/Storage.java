package com.javaPlus.java.plus.producerconsumer.conditionsimple;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {

    private final int MAX_SIZE = 100;

    private final Lock lock = new ReentrantLock();

    private LinkedList<Object> list = new LinkedList<>();

    private final Condition full = lock.newCondition();

    private final Condition empty = lock.newCondition();

    public void produce(String produce) {
        lock.lock();    //进入临界区,进行加锁操作
        while (list.size() == MAX_SIZE) {
            System.out.println("缓冲队列已满,暂时不能执行生产任务");
            try {
                full.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(new Object());
        System.out.println("生产了一个任务, 缓冲区大小为" + list.size());
        empty.signalAll();
        lock.unlock();  //出临界区,进行解锁操作
    }

    public void consumer(String consumer) {
        lock.lock();
        while (list.size() == 0) {
            System.out.println("缓冲区为空,暂时不能执行消费任务");
            try {
                empty.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.remove();  //消费队列中的一个任务
        System.out.println("消费了一个任务, 缓冲区大小为" + list.size());

        full.signalAll();   //唤醒其他线程
        lock.unlock();

    }

}
