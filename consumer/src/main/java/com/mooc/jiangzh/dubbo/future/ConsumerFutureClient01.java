package com.mooc.jiangzh.dubbo.future;

import com.mooc.jiangzh.dubbo.ServiceAPI2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * 测试同步情况
 */
public class ConsumerFutureClient01 {

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
            String sendMessage01 = serviceAPI.sendMessage1(message);
            long sendEndTime01 = System.currentTimeMillis();
            String sendMessage02 = serviceAPI.sendMessage2(message);
            long sendEndTime02 = System.currentTimeMillis();
            System.out.println(sendMessage01+"," +sendMessage02+",send执行时间="+(sendEndTime01-beginTime)+",send2"+ (sendEndTime02-beginTime));



        }
    }
}
