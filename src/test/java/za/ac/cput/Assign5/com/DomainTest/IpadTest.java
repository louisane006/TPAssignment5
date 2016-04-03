package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Ipad;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class IpadTest {
    Ipad ipad;
    Ipad newIpad;

    public IpadTest() {
    }
    @Test
    public void createTest(){
        ipad = new Ipad.Builder().id("4412210010").code("CKM200").name("KT5100").costPrice(10000.00).build();
        Assert.assertEquals(ipad.getPrice() , 10000.00);
    }
    @Test
    public void updateTest() {
        newIpad = new Ipad.Builder().costPrice(8000.00).build();
        Assert.assertEquals(newIpad.getPrice(), 8000.00);
    }
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @BeforeMethod
    public void setUpMethod() throws Exception {
    }
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
