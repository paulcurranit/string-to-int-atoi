import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtoiTest {

    @Test
    public void test1() {
        long result = Atoi.myAtoi("42");
        assertEquals(result, 42);
    }

    @Test
    public void test2() {
        long result = Atoi.myAtoi("     -42");
        assertEquals(result, -42);
    }

    @Test
    public void test3() {
        long result = Atoi.myAtoi("4193 with words");
        assertEquals(result, 4193);
    }

    @Test
    public void test4() {
        long result = Atoi.myAtoi("words and 987");
        assertEquals(result, 0);
    }

    @Test
    public void test5() {
        long result = Atoi.myAtoi("-91283472332");
        assertEquals(result, Integer.MIN_VALUE);
    }

    @Test
    public void test6() {
        long result = Atoi.myAtoi("" + Integer.MAX_VALUE + "523123");
        assertEquals(result, Integer.MAX_VALUE);
    }
}
