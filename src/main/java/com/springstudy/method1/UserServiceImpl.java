package com.springstudy.method1;


/**
 * @author haohong
 */
public class UserServiceImpl {
    private long begin;

    public void before() {
        begin = System.currentTimeMillis();
    }

    public void getUserList() throws Exception {
        before();

        System.out.println("connect db");
        long sleep = (long) (Math.random() * 5000);
        // 模拟5秒内的数据库查询
        Thread.sleep(sleep);
        System.out.println("return user list");

        after();
    }

    public void after() {
        long end = System.currentTimeMillis();
        System.out.println("execute time: " + (end - begin) + " milli seconds");
    }
}
