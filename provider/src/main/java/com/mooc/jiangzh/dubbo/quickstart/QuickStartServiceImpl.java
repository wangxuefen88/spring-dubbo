package com.mooc.jiangzh.dubbo.quickstart;


import com.alibaba.dubbo.rpc.RpcContext;
import com.mooc.jiangzh.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

    @Override
    public String sendMessage(String message) {
        System.out.println(RpcContext.getContext().getAttachment("key"));
        System.out.println("quickstart-provider-message=" + message);
        return "quickstart-provider-message=" + message;
    }

}
