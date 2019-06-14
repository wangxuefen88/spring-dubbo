package com.mooc.jiangzh.dubbo.group;

import com.mooc.jiangzh.dubbo.ServiceAPI2;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 7:45 2019/6/13
 */
public class GroupServoceImlA implements ServiceAPI2 {


    @Override
    public String sendMessage1(String message) throws InterruptedException {
        Thread.sleep(2000);
        return "GroupServoceImlA-provider-sendMessage1"+message;
    }

    @Override
    public String sendMessage2(String message) throws InterruptedException {
        Thread.sleep(4000);
        return "GroupServoceImlA-provider-sendMessage2"+message;
    }
}
