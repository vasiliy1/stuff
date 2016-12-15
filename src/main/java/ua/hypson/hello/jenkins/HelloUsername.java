package ua.hypson.hello.jenkins;

/**
 * @author vasiliy
 */
public class HelloUsername {

    public String hello(String username) {
        if(!username.isEmpty()) {
            return "Hello, " + username + "!";
        } else {
            return "Hello, World!";
        }
    }
}
