package com.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo {

    public static void main(String[] args) {

        //ForkJoin线程池：ForkJoinPool
        System.out.printf("当前CPU处理器数:%d\n", ForkJoinPool.commonPool().getParallelism());
        System.out.printf("当前CPU处理器数:%d\n", Runtime.getRuntime().availableProcessors());

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        forkJoinPool.invoke(new RecursiveAction() {
            @Override
            protected void compute() {
                System.out.printf("[Thread: %s] Hello World...\n", Thread.currentThread().getName());
            }
        });
        forkJoinPool.shutdown();
    }
}
