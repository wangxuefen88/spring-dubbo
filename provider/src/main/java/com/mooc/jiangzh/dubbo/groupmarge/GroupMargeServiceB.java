package com.mooc.jiangzh.dubbo.groupmarge;

import com.mooc.jiangzh.dubbo.ServiceGroupMargeAPI2;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 9:22 2019/6/13
 */
public class GroupMargeServiceB implements ServiceGroupMargeAPI2 {
    @Override
    public String sendMessage1(String message) throws InterruptedException {
        return null;
    }

    @Override
    public String sendMessage2(String message) throws InterruptedException {
        return null;
    }

    @Override
    public List<String> merteTest(String message) {
        String s = "groupA=" + message;
        return Arrays.asList(s);
    }
}
