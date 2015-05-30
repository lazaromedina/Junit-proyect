package com.packtpub.junit.recap;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {

    private int number;
    private int expectedResult;

    public ParameterizedFactorialTest(int input, int expected) {
        number= input;
        expectedResult= expected;
    }


    @Parameters
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][] {
                { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 },
                { 4, 24 }, { 5, 120 },{ 6, 720 }
        }); }

    @Test
    public void factorial() throws Exception {
        Factorial fact = new Factorial();
        assertEquals(fact.factorial(number),expectedResult);
    }
}
