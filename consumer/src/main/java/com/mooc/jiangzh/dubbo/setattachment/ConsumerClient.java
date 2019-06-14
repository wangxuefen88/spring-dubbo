package com.mooc.jiangzh.dubbo.setattachment;

import com.alibaba.dubbo.rpc.RpcContext;
import com.mooc.jiangzh.dubbo.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ConsumerClient {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            // 获取接口
            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            RpcContext.getContext().setAttachment("key", "judy");
            System.out.println(serviceAPI.sendMessage(message));

        }
    }
}
