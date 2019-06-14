package com.xujingfeng.demo;

import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.FutureListener;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 16:33 2019/6/12
 */
public class NettyFutureDemo {
    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();
        EventLoopGroup group = new DefaultEventLoopGroup(4);
        Future<Integer>future = group.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("执行耗时操作");
                timeConsumingOperation();
                return 100;
            }
        });

        future.addListener(new FutureListener<Object>() {
            @Override
            public void operationComplete(Future<Object> objectFuture) throws Exception {
                System.out.println("计算结果:" + objectFuture.get());
            }
        });
        System.out.println("主线程运算耗时:"+ (System.currentTimeMillis() - l) + " ms");
        new CountDownLatch(1).await();
    }
    static void timeConsumingOperation() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
