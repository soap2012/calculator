import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator2UnitTest {
    Calculator2 cal = new Calculator2();
    @Test
    public void multiplyUnitTest(){
        Assert.assertEquals(cal.multiply(111,2),111*2);
    }
    @Test
    public void devideUnitTest(){
        Assert.assertEquals(cal.devide(5.1,3),1.7);
    }
}
