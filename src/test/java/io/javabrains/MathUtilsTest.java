package io.javabrains;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void test()
    {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual);

    }

    @Test
    void testComputeCircleRadius()
    {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return the right circle area!");
    }
}
