package com.springstudy.method3;

import com.springstudy.Hello;
import org.junit.Test;

/**
 * @author haohong
 */
public class JDKDynamicProxyTest {
    @Test
    public void testGetUserList() throws Exception {
        UserService userService = new JDKDynamicProxy(new UserServiceImpl())
                .getProxy();

        userService.getUserList();
    }
}
