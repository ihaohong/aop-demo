package com.springstudy.method4;

import org.junit.Test;

/**
 * @author haohong
 */
public class CGLibDynamicProxyTest {
    @Test
    public void testGetUserList() throws Exception {
        UserServiceImpl userServiceImpl = CGLibDynamicProxy.getInstance().getProxy(UserServiceImpl.class);
        userServiceImpl.getUserList();
    }
}
