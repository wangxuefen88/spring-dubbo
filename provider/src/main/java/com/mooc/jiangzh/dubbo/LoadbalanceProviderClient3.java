package com.mooc.jiangzh.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 9:12 2019/6/12
 */
public class LoadbalanceProviderClient3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-loadbalance-provider3.xml");

        context.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
