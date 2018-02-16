package com.springstudy.method4;

/**
 * @author haohong
 */
public class UserServiceImpl {
    public void getUserList() throws Exception {
        System.out.println("connect db");
        long sleep = (long) (Math.random() * 5000);
        // 模拟5秒内的数据库查询
        Thread.sleep(sleep);
        System.out.println("return user list");
    }
}
