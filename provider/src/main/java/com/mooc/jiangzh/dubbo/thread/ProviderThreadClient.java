package com.mooc.jiangzh.dubbo.thread;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/***
 * 线程模型
 */
public class ProviderThreadClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-thread-provider.xml");

        context.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
