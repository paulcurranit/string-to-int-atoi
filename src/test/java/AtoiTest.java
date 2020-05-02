import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AtoiTest {

    @Test
    public void test1() {
        long result = Atoi.myAtoi("42");
        assertTrue(result == 42);
    }

    @Test
    public void test2() {
        long result = Atoi.myAtoi("     -42");
        assertTrue(result == -42);
    }

    @Test
    public void test3() {
        long result = Atoi.myAtoi("4193 with words");
        assertTrue(result == 4193);
    }

    @Test
    public void test4() {
        long result = Atoi.myAtoi("words and 987");
        assertTrue(result == 0);
    }

    @Test
    public void test5() {
        long result = Atoi.myAtoi("-91283472332");
        assertTrue(result == Integer.MIN_VALUE);
    }

    @Test
    public void test6() {
        long result = Atoi.myAtoi("" + Integer.MAX_VALUE + "523123");
        assertTrue(result == Integer.MAX_VALUE);
    }
}
