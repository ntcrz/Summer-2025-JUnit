package com.SAM;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
    private Calculator calc;
    @BeforeEach
    void setup()
    {
        calc = new Calculator();
        calc.switchOn();
    }
    @Test
    void minus1plus1()
    {

        calc.add(-1);
        calc.add(1);
        assertEquals(0, calc.getResult());

    }
    @Test
    void add100and1()
    {

        calc.add(100);
        calc.add(1);
        assertEquals(101, calc.getResult());

    }
}
