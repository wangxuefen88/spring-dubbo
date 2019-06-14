package com.mooc.jiangzh.dubbo.mock;

import com.mooc.jiangzh.dubbo.ServiceAPI2;

/**
 * @Author: judy
 * @Description: 服务降级
 * @Date: Created in 12:38 2019/6/13
 */
public class MyMock implements ServiceAPI2 {
    @Override
    public String sendMessage1(String message)   {
        return "抱歉,订单人数过多,请稍后重试";
    }

    @Override
    public String sendMessage2(String message)   {
        return "抱歉,订单人数过多,请稍后重试";
    }
}
