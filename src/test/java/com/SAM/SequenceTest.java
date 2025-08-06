package com.SAM;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SequenceTest
{
    @Order(2)
    @Test
    void test1()
    {
        System.out.println("test 1 -2");
    }
    @Order(1)
    @Test
    void test2()
    {
        System.out.println("test 2 - 1");
    }
    @Order(4)
    @Test
    void test3()
    {
        System.out.println("test 3 - 4");
    }
    @Order(3)
    @Test
    void test4()
    {
        System.out.println("test 4- 3");
    }
}
