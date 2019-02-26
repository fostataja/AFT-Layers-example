package Unit;

import com.mainacad.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RandomGeneratorTest {

    //@Test
    public void generatedNumberInRangeTest(){
        RandomGenerator rg = new RandomGenerator();
        double actualRandomNumber = rg.getRandom();

        Assert.assertThat( actualRandomNumber, greaterThan(1.0));
    }
}