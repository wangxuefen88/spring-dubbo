package com.mooc.jiangzh.dubbo.group;

import com.mooc.jiangzh.dubbo.ServiceAPI2;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 7:46 2019/6/13
 */
public class GroupServoceImlB implements ServiceAPI2 {


    @Override
    public String sendMessage1(String message) throws InterruptedException {
        Thread.sleep(2000);
        return "GroupServoceImlB-provider-sendMessage1"+message;
    }

    @Override
    public String sendMessage2(String message) throws InterruptedException {
        Thread.sleep(4000);
        return "GroupServoceImlB-provider-sendMessage2"+message;
    }
}
