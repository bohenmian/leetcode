package com.thread;

public class CompleteRunnable {

    public static void main(String[] args) throws InterruptedException {
        CompletableRunnable runnable = new CompletableRunnable();
        Thread thread = new Thread(runnable,"Sub");
        thread.start();
        thread.join();
        System.out.println("[Thread] Starting..." + Thread.currentThread().getName());
        System.out.println("runnable is completed: " + runnable.completed);
    }

    private static class CompletableRunnable implements Runnable {
        private boolean completed = false;

        @Override
        public void run() {
            System.out.println("[Thread] Hello World..." + Thread.currentThread().getName());
            completed = true;
        }

        public boolean isCompleted() {
            return completed;
        }
    }

}
