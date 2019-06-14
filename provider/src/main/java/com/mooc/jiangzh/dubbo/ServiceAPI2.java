package com.mooc.jiangzh.dubbo;

/**
 *  dubbo异步调用
 */
public interface ServiceAPI2 {

    String sendMessage1(String message) throws InterruptedException;

    String sendMessage2(String message) throws InterruptedException;

}
