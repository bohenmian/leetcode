package com.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.LongAdder;

/**
 * ForkJoin 1-10累加
 */

public class ForkJoinDemo2 {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //RecursiveAction递归操作

        LongAdder longAdder = new LongAdder();

        AddTask addTask = new AddTask(nums, longAdder);

        forkJoinPool.invoke(addTask);
        forkJoinPool.shutdown();

        System.out.println(longAdder);
    }

    private static class AddTask extends RecursiveAction {

        private final List<Integer> nums;

        private final LongAdder longAdder;

        public AddTask(List<Integer> nums, LongAdder longAdder) {
            this.nums = nums;
            this.longAdder = longAdder;
        }

        @Override
        protected void compute() {
            int size = nums.size();
            if (size > 1) {
                int partSize = size / 2;
                List<Integer> leftPart = nums.subList(0, partSize);
                AddTask leftTask = new AddTask(leftPart, longAdder);
                List<Integer> rightPart = nums.subList(partSize, size);
                AddTask rightTask = new AddTask(rightPart, longAdder);
                invokeAll(leftTask, rightTask); //fork/join
            } else {
                if (size == 0) {
                    return;
                }
                Integer value = nums.get(0);
                longAdder.add(value.longValue());

            }

        }
    }


}
