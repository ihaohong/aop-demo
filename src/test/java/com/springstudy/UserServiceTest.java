package com.springstudy;

import org.junit.Test;

/**
 * @author haohong
 */
public class UserServiceTest {
    @Test
    public void testGetUserList() throws Exception {
        new UserService().getUserList();
    }
}
