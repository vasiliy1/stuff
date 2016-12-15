package ua.hypson.hello.jenkins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author vasiliy
 */
public class HelloUsernameTest {

    @Test
    public void helloTest() {
        HelloUsername helloUsername = new HelloUsername();
        assertEquals("Hello, John!!", helloUsername.hello("John"));
    }
}
