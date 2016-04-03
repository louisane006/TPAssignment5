package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Designer;
import za.ac.cput.Assign5.com.Domain.Frame;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class FrameTest {

    Frame frame;
    Frame newFrame;
    Designer designer;
    Customer customer;
    public FrameTest() {
    }
    @Test
    public void createTest(){
        frame = new Frame.Builder().designer(designer).desc("CI1000").taskId("2000").customer(customer).build();
        Assert.assertEquals(frame.getCustomer() , customer);
    }
    @Test
    public void updateTest() {
        newFrame = new Frame.Builder().customer(customer).build();
        Assert.assertEquals(newFrame.getCustomer(), customer);
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

