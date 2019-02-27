package com.mainacad;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTwoNumbersTest {

    @Test
    public void add() {
        AdditionTwoNumbers twoNumbers = new AdditionTwoNumbers( 0, 0);
        Assert.assertEquals(1, twoNumbers.add());
    }
}