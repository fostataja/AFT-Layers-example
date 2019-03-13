package Unit;

import com.mainacad.AdditionTwoNumbers;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.DataProvider;

import static org.junit.Assert.*;

public class AdditionTwoNumbersTest {

    //TestdID|  a | b | expected
    // 0 | 0 | 0
    // 2 | 2 | 4

    @DataProvider(name = "forAddingTest")
    public Object[][] createData1() {
        return new Object[][] {
                { 0, "Cedric", new Integer(36) },
                { "Anne", new Integer(37)},
        };
    }

    //This test method declares that its data should be supplied by the Data Provider
    //named "test1"
    @Test(dataProvider = "test1")
    public void verifyData1(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);
    }


    private void add(int a,  int b, int expected) {
        AdditionTwoNumbers twoNumbers = new AdditionTwoNumbers( a, b);
        Assert.assertEquals(expected, twoNumbers.add());

    }

    @Test
    public void runAddTest() {
        add(0,0,0);
    }
}