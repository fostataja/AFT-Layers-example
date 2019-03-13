package Unit;

import com.mainacad.AdditionTwoNumbers;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class AdditionTwoNumbersTest {

    @DataProvider(name = "AddingTestDP")
    public Object[][] createData1() {
        return new Object[][] {
                { 0, 0, 0 },
                { 2, 2, 4},
        };
    }

    private void add(int a,  int b, int expected) {
        AdditionTwoNumbers twoNumbers = new AdditionTwoNumbers( a, b);
        Assert.assertEquals(expected, twoNumbers.add());

    }

    @Test(dataProvider = "AddingTestDP")
    public void runAddTest( int a, int b, int expectedSum) {
        System.out.println(a + " " + b + " " + expectedSum);
        add(a, b, expectedSum);
    }
}