package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Customer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CustomerTest {

    Customer customer;
    Customer newCustomer;
    public CustomerTest() {
    }
    @Test
    public void createTest(){
        customer = new Customer.Builder("10000").idendtification("CI100").name("Sarah").surname("Smith").build();
        Assert.assertEquals(customer.getName() , "Sarah");
    }
    @Test
    public void updateTest() {
        newCustomer = new Customer.Builder("10000").name("Lorrie").build();
        Assert.assertEquals(newCustomer.getName(), "Lorrie");
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
