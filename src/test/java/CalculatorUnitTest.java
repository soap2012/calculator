import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorUnitTest {
    Calculator cal = new Calculator();
    Calculator2 cal2 = org.mockito.Mockito.mock(Calculator2.class);
    @DataProvider(name = "addTestDataProvider")
    public Object[][] addTestDataProvider(){
        return new Object[][] {{1,2},{2,3},{100,200}};
    }

    @Test(dataProvider = "addTestDataProvider")
    public void AddUnitTest(double a,double b){

        Assert.assertEquals(cal.add(a,b),a+b);
        System.out.println("add unit test");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After method");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("after class");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("after test");
    }

    @Test
    public void SubUnitTest(){
        Assert.assertEquals(cal.sub(5,2),5d-2d);
        System.out.println("sub unit test");
    }

    @Test
    public void arithmeticUnitTest(){
        int a,b,c;
        Mockito.when(cal2.getPi()).thenReturn(7.0);
        Assert.assertEquals(cal.sub(cal2.getPi(),1),6d);
    }

}
