package com.mainacad;

import org.junit.Assert;
import org.junit.Test;

public class RandomGeneratorTest {

    //@Test
    public void resultLessThanOne() {

        RandomGenerator rg = new RandomGenerator();
        Double actualResult = rg.getRandom();

        Assert.assertTrue( actualResult < 1 );
        //Assert.assertEquals( 1.0, actualResult, 0.0);
    }

    //@Test
    public void resultGreaterOrEqualsZero() {

        RandomGenerator rg = new RandomGenerator();
        Double actualResult = rg.getRandom();

        Assert.assertTrue( actualResult >= 0 );
    }

}