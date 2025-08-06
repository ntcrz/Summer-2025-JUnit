package com.SAM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest
{
    @Test
    void standardAssertions()
    {
      assertEquals(2, 1+1, "sum 1 + 1 must be 2");
      assertTrue(1 < 3);
      assertFalse(1 >11, "1 is less than 11");
      assertNotEquals(1, 21);


    }
    @Test
    void testALl()
    {
        int value = 4;
        assertAll(
                "example of assertAll",
                () -> assertEquals(value, 2 * 4, "4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertNotEquals(0, value, "value cannot be 0"),
                () -> assertTrue(value != 4, "value is 4")
                );
    }
}
