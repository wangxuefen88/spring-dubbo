package com.mooc.jiangzh.dubbo.mock;

import com.mooc.jiangzh.dubbo.ServiceAPI2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ConsumerMockClient {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mock-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            // 获取接口
            ServiceAPI2 serviceAPI = (ServiceAPI2) context.getBean("consumerService");
                System.out.println(serviceAPI.sendMessage1(message));
        }
    }
}
