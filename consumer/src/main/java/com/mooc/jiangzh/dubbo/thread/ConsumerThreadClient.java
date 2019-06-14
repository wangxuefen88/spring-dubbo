package com.mooc.jiangzh.dubbo.thread;

import com.mooc.jiangzh.dubbo.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerThreadClient {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
        context.start();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            ExecutorService es = Executors.newFixedThreadPool(5);
            MyTask task = new MyTask(message,context);
            // 获取接口
            for (int i = 0; i < 10; i++) {
                es.submit(task);
            }
        }
    }


    public static class MyTask implements Runnable {
        private String message;
        private ClassPathXmlApplicationContext context;
        public MyTask( String message,ClassPathXmlApplicationContext context ) {
            this.context = context;
            this.message = message;
        }

        @Override
        public void run() {
            try {

                ServiceAPI serviceAPI = (ServiceAPI) this.context.getBean("consumerService");
                serviceAPI.sendMessage(this.message );
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
