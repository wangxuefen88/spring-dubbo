package com.mooc.jiangzh.dubbo.future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * dubbo异步调用测试
 */
public class ProviderFutureClient02 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-future02-provider.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
