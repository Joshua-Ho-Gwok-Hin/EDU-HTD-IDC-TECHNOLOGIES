import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PretRockTest {

    @Test
    void sum() {

        PretRock pretRock = new PretRock();
        int result = pretRock.sum(100, 200);
        {
            assertEquals(300, result);

        }
    }

    @Test
    void testSum() {
    }
}