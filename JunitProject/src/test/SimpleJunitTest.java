import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleJunitTest {

    SimpleJunit simpleJunit = new SimpleJunit();


    @Test
    void minus() {
        int result = simpleJunit.minus(100, 50);
        {
            assertEquals(50,result);
        }
    }
}