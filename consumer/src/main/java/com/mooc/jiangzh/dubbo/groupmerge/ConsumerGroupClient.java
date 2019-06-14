package com.mooc.jiangzh.dubbo.groupmerge;

import com.mooc.jiangzh.dubbo.ServiceAPI2;
import com.mooc.jiangzh.dubbo.ServiceGroupMargeAPI2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ConsumerGroupClient {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-groupmerger-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            // 获取接口
            ServiceGroupMargeAPI2 serviceAPI = (ServiceGroupMargeAPI2) context.getBean("consumerService");

            System.out.println(serviceAPI.merteTest(message));
        }
    }
}
