package com.springstudy.method1;

import org.junit.Test;

/**
 * @author haohong
 */
public class UserServiceImplTest {
    @Test
    public void testGetUserList() throws Exception {
        new UserServiceImpl().getUserList();
    }
}
