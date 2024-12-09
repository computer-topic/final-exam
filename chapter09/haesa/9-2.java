import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MyTest {
    // (1) 어노테이션
    static void initAll() { // Code executed before all test methods
    }

    // (2) 어노테이션
    void init() { // Code executed before each test method
    }

    // (3) 어노테이션
    void test() { // test method code
    }

    // (4) 어노테이션
    // (5) 어노테이션
    void skippedTest() { // not executed
    }

    // (6) 어노테이션
    void tearDown() { // Code executed after each test method
    }

    // (7) 어노테이션
    static void tearDownAll() { // Code executed after all test methods
    }
    
}