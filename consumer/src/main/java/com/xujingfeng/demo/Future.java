package com.xujingfeng.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 16:07 2019/6/12
 */
public class Future<I extends Number> {
    public static void main(String[] args) throws ExecutionException, InterruptedException, ExecutionException {
        long l = System.currentTimeMillis();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        java.util.concurrent.Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("执行耗时操作...");
                timeConsumingOperation();
                return 100;
            }
        }); //<1>
        //其他耗时操作..<3>
        System.out.println("计算结果:" + future.get());//<2>
        System.out.println("主线程运算耗时:" + (System.currentTimeMillis() - l) + " ms");
    }

    static void timeConsumingOperation() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
