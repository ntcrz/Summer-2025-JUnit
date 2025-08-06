package com.SAM;

import org.junit.jupiter.api.*;

public class TemplateTest
{
    @BeforeAll
    static void oneTimeSetup ()
    {
        System.out.println("before all");
    }

    @BeforeEach
    void setup()
    {
        System.out.println("setup");
    }

    @DisplayName("My First Test")
    @Test
    void test1()
    {
        System.out.println("test1");
    }

    @Test
    void test2()
    {
        System.out.println("test2");
    }

    @Disabled("not ready yet")
    @Test
    void test3()
    {
        System.out.println("test 3");
    }

    @AfterEach
    void teardown()
    {
        System.out.println("teardown");
    }

    @AfterAll
    static void oneTimeTearDown()
    {
        System.out.println("after all");
    }

}
