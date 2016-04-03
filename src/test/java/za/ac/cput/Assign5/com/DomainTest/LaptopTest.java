package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Laptop;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class LaptopTest {
    Laptop laptop;
    Laptop newLaptop;

    public LaptopTest() {
    }
    @Test
    public void createTest(){
        laptop = new Laptop.Builder().id("2130102010120").name("Lenovo").code("44500").price(4500.00).build();
        Assert.assertEquals(laptop.getPrice() , 4500.00);
    }
    @Test
    public void updateTest() {
        newLaptop = new Laptop.Builder().price(3500.00).build();
        Assert.assertEquals(newLaptop.getPrice(), 3500.00);
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
