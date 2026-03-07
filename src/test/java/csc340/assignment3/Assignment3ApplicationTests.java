package csc340.assignment3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // <-- uses application-test.properties
class Assignment3ApplicationTests {

    @Test
    void contextLoads() {
        // If Spring context loads, this test passes automatically
    }
}