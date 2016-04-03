package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.SmartScreen;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class SmartScreenTest {
    SmartScreen screen;
    SmartScreen newScreen;

    public SmartScreenTest() {
    }
    @Test
    public void createTest(){
        screen = new SmartScreen.Builder().id("102010120").name("Samsung").code("44500").costPrice(20000.00).build();
        Assert.assertEquals(screen.getName() , "Samsung");
    }
    @Test
    public void updateTest() {
        newScreen = new SmartScreen.Builder().name("LG").build();
        Assert.assertEquals(newScreen.getName(), "LG");
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
