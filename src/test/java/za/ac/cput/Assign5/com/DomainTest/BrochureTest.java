package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.*;
import za.ac.cput.Assign5.com.Domain.Brochure;
import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Designer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class BrochureTest {
   Brochure brochure;
    Brochure newBrochure;
    Designer designer;
    Customer customer;
    public BrochureTest() {
    }
    @Test
    public void createTest(){
        brochure = new Brochure.Builder().desc("TM100").designer(designer).customer(customer).taskNum("10000").build();
        Assert.assertEquals(brochure.getDesigner() , designer);
    }
    @Test
    public void updateTest() {
        newBrochure = new Brochure.Builder().designer(designer).build();
        Assert.assertEquals(newBrochure.getDesigner(), designer);
    }
    @BeforeClass
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
