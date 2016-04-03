package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Printer;
import za.ac.cput.Assign5.com.Domain.Prints;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class PrintsTest {
    Prints print;
    Prints newPrint;
    Printer printer;
    Customer customer;

    public PrintsTest() {
    }
    @Test
    public void createTest(){
        print = new Prints.Builder().printer(printer).desc("Wedding Cards").customer(customer).taskId("101").price(100.00).build();
        Assert.assertEquals(print.getCustomer() , customer);
    }
    @Test
    public void updateTest() {
        newPrint = new Prints.Builder().customer(customer).build();
        Assert.assertEquals(newPrint.getCustomer(), customer);
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
