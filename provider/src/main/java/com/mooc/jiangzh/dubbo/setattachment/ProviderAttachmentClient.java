package com.mooc.jiangzh.dubbo.setattachment;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderAttachmentClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-provider.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
