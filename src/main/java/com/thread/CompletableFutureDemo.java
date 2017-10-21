package com.thread;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * {@link CompletableFutureDemo} Demo
 *
 * @see java.util.concurrent.CompletionStage
 * @see java.util.concurrent.CompletableFuture
 */

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        完成操作
//        CompletableFuture<String> completableFuture = new CompletableFuture<>();
//        completableFuture.complete("Hello World");
//        String value1 = completableFuture.get();
//        System.out.println(value1);
//
//        //异步操作,阻塞操作
//        CompletableFuture asyncCompletableFuture = CompletableFuture.runAsync(() -> {
//            System.out.println("Hello World");
//        });
//        asyncCompletableFuture.get();
//        System.out.println("Starting ...");

        //异步操作
//        CompletableFuture<String> supplyAsyncCompletableFuture1 = CompletableFuture.supplyAsync(() -> {
//            return String.format("[Thread: %s] Hello World...\n", Thread.currentThread().getName());
//        });
//        String value1 = supplyAsyncCompletableFuture1.get();
//        System.out.println("value: " + value1);

        //合并操作
        CompletableFuture combineCompletablableFuture = CompletableFuture.supplyAsync(() -> {
            return String.format("[Thread: %s] Hello World...", Thread.currentThread().getName());
        }).thenApply(value -> {
            return value + "来自数据库";
        }).thenApply(value -> {
            return value + "at" + LocalDate.now();
        }).thenApply(value -> {
            System.out.println(value);
            return value;
        }).thenRun(() -> {
            System.out.println("结束操作");
        });
        while (!combineCompletablableFuture.isDone()) {

        }

        System.out.println("Starting ...");
    }


}
