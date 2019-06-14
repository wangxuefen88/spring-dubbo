package com.mooc.jiangzh.dubbo.stubroot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderRootClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-root-provider.xml");

        context.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
