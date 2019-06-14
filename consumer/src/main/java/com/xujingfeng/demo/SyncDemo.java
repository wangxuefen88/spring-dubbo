package com.xujingfeng.demo;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 16:01 2019/6/12
 */
public class SyncDemo {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        int i = syncCalculate();
        System.out.println("计算结果:" + i);
        System.out.println("主线程运算耗时:" + (System.currentTimeMillis() - l));

    }

    static int syncCalculate() {
        System.out.println("执行耗时操作");
        timeConsumingOperation();
        return 100;
    }

    static void timeConsumingOperation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
