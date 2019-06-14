package com.mooc.jiangzh.dubbo.stubroot;

import com.mooc.jiangzh.dubbo.ServiceAPI2;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 7:45 2019/6/13
 */
public class RootServoceImlA implements ServiceAPI2 {


    @Override
    public String sendMessage1(String message)   {
        return "RootServoceImlA-provider-sendMessage1"+message;
    }

    @Override
    public String sendMessage2(String message)   {
        return "RootServoceImlA-provider-sendMessage2"+message;
    }
}
