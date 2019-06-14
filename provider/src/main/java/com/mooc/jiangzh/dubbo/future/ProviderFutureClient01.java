package com.mooc.jiangzh.dubbo.future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 测试同步情况
 */
public class ProviderFutureClient01 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-future01-provider.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
