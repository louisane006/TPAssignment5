package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Cashier;
import za.ac.cput.Assign5.com.Domain.Laptop;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CashierTest {
    Cashier cashier;
    Cashier newCashier;
    Laptop laptop;
    public CashierTest() {
    }
    @Test
    public void createTest(){
        cashier = new Cashier.Builder("10000").identification("1000").name("Karen").surname("Thomas").build();
        Assert.assertEquals(cashier.getSurname() , "Thomas");
    }
    @Test
    public void updateTest() {
        newCashier = new Cashier.Builder("10000").surname("Smith").build();
        Assert.assertEquals(newCashier.getSurname(), "Smith");
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
