import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    static Utilities util;


    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        util = new Utilities();
    }


    @org.junit.jupiter.api.BeforeEach
    void init() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
//        fail("tearDown() is empty");
    }

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', '0'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
    }

    @org.junit.jupiter.api.Test
    void everyNthChar_length_exceeded() {
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 6);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output);
    }

    @org.junit.jupiter.api.Test
    void removePairs() {
        String result = util.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", result);
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull(util.removePairs(null), "This should be null");
        assertEquals("A", util.removePairs("A"));

    }

    @org.junit.jupiter.api.Test
    void converter() {
        assertEquals(300, util.converter(10, 5), 0.1);
    }

    @org.junit.jupiter.api.Test
    void converter_ArithmeticException() {
        assertThrows(ArithmeticException.class, () -> util.converter(10, 0), "Arithmetic Exception should be thrown here!");
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength_even() {
        String evenString = "String is Even";
        assertNotNull(util.nullIfOddLength(evenString), "Even string should not be null!");
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength_odd() {
        String oddString = "String is odd";
        assertNull(util.nullIfOddLength(oddString), "Odd string should be null!");
    }

    @org.junit.jupiter.api.Test
    void converter_another_exception() {
        assertThrows(ArithmeticException.class, () -> util.converter(10, 0));
    }
}