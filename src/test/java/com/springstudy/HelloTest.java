package com.springstudy;

import org.junit.Test;

/**
 * @author haohong
 */
public class HelloTest {
    @Test
    public void testHello() {
        assert Hello.hello().equals("Hello");
    }
}
