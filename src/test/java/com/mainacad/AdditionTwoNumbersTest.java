package com.mainacad;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTwoNumbersTest {

    //TestdID|  a | b | expected
    // 0 | 0 | 0
    // 2 | 2 | 4

    private void add(int a,  int b, int expected) {
        AdditionTwoNumbers twoNumbers = new AdditionTwoNumbers( a, b);
        Assert.assertEquals(expected, twoNumbers.add());

    }

    @Test
    public void runAddTest() {
        add(0,0,0);
    }
}