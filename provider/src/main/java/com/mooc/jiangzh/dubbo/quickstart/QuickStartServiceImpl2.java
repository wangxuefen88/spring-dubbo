package com.mooc.jiangzh.dubbo.quickstart;


import com.mooc.jiangzh.dubbo.ServiceAPI2;

/**
 * 实现dubbo的异步调用
 */
public class QuickStartServiceImpl2 implements ServiceAPI2 {


    @Override
    public String sendMessage1(String message) throws InterruptedException {
        Thread.sleep(2000);
        return "provider-sendMessage1"+message;
    }

    @Override
    public String sendMessage2(String message) throws InterruptedException {
        Thread.sleep(4000);
        return "provider-sendMessage2"+message;
    }
}
