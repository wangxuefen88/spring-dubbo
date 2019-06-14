package com.mooc.jiangzh.dubbo.filter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderFilterClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-filter-provider.xml");

        context.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
