package com.mooc.jiangzh.dubbo.filter;

import com.alibaba.dubbo.rpc.*;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 15:31 2019/6/13
 */
public class MyFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("服务调用之前"+invocation.getMethodName());
        Result invoke = invoker.invoke(invocation);
        System.out.println("服务调用之后");
        return invoke;
    }
}
