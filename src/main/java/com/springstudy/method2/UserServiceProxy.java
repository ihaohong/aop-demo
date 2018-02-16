package com.springstudy.method2;

/**
 * @author haohohong
 */
public class UserServiceProxy implements UserService {
    private UserService userService;
    private long begin;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void before() {
        begin = System.currentTimeMillis();
    }

    @Override
    public void getUserList() throws Exception {
        before();
        this.userService.getUserList();
        after();
    }

    public void after() {
        long end = System.currentTimeMillis();
        System.out.println("execute time: " + (end - begin) + " milli seconds");
    }
}
