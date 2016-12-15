package ua.hypson.hello.jenkins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author vasiliy
 */
public class HelloUsernameTest {

    @Test
    public void testHelloWithNotEmptyString() {
        HelloUsername helloUsername = new HelloUsername();
        assertEquals("Hello, John!", helloUsername.hello("John"));
    }

    @Test
    public void testHelloWithEmptyString() {
        HelloUsername helloUsername = new HelloUsername();
        assertEquals("Hello, World!", helloUsername.hello(""));
    }
}
