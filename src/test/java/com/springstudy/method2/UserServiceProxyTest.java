package com.springstudy.method2;

import org.junit.Test;

/**
 * @author haohong
 */
public class UserServiceProxyTest {
    @Test
    public void testGetUserList() throws Exception {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());
        userServiceProxy.getUserList();
    }
}
