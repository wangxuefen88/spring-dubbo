package com.mooc.jiangzh.dubbo;

import java.util.List;

/**
 *  dubbo异步调用
 */
public interface ServiceGroupMargeAPI2 {

    String sendMessage1(String message) throws InterruptedException;

    String sendMessage2(String message) throws InterruptedException;

    List<String> merteTest(String message);

}
