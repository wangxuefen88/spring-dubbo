package com.mooc.jiangzh.dubbo.future;

import com.alibaba.dubbo.rpc.RpcContext;
import com.mooc.jiangzh.dubbo.ServiceAPI2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 测试异步调用
 */
public class ConsumerFutureClient02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-feture01-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            // 获取接口
            ServiceAPI2 serviceAPI = (ServiceAPI2) context.getBean("consumerService");
            /*测试异步调用*/

            long beginTime = System.currentTimeMillis();
            serviceAPI.sendMessage1(message);
            Future<String> future1 = RpcContext.getContext().getFuture();

            long sendEndTime01 = System.currentTimeMillis();

            serviceAPI.sendMessage2(message);
            Future<String> future2 = RpcContext.getContext().getFuture();
            long sendEndTime02 = System.currentTimeMillis();

            System.out.println(future1.get()+"," +future2.get()+",send执行时间="+(sendEndTime01-beginTime)+",send2"+ (sendEndTime02-beginTime));
            System.out.println("send执行时间="+(sendEndTime01-beginTime)+",send2"+ (sendEndTime02-beginTime));
        }
    }
}
