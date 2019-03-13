package Unit;

import com.mainacad.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RandomGeneratorTest {

    @Test
    public void generatedNumberInRangeTest(){
        RandomGenerator rg = new RandomGenerator();
        double actualRandomNumber = rg.getRandom();

        Assert.assertThat( actualRandomNumber, lessThan(1.0));
    }

    @Test
    public void resultLessThanOne() {

        RandomGenerator rg = new RandomGenerator();
        Double actualResult = rg.getRandom();

        Assert.assertTrue( actualResult < 1 );
        //Assert.assertEquals( 1.0, actualResult, 0.0);
    }

    @Test
    public void resultGreaterOrEqualsZero() {

        RandomGenerator rg = new RandomGenerator();
        Double actualResult = rg.getRandom();

        Assert.assertTrue( actualResult >= 0 );
    }

}