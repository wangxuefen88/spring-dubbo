package com.mooc.jiangzh.dubbo.controller;

import com.mooc.jiangzh.dubbo.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 *  制定连接数
 */
public class ConsumerControlelrClient02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            // 获取接口
            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            for (int i = 0; i < 10; i++) {
                System.out.println(serviceAPI.sendMessage(message));
           }
        }
    }
}
