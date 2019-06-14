package com.mooc.jiangzh.dubbo.stubroot;

import com.mooc.jiangzh.dubbo.ServiceAPI2;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 11:00 2019/6/13
 */
public class MyRoot implements ServiceAPI2 {

    //注入Proxy的构造函数
    private final ServiceAPI2 serviceAPI;

    public MyRoot(ServiceAPI2 serviceAPI) {
        this.serviceAPI = serviceAPI;
    }

    @Override
    public String sendMessage1(String message){
        if (message.equals("123")) {
            return "抱歉,该值不能被接受";
        }else {
            message = "stub messasge ->" + message;
            return this.serviceAPI.sendMessage2(message);
        }
    }

    @Override
    public String sendMessage2(String message)  {
        return this.serviceAPI.sendMessage2(message);
    }
}
