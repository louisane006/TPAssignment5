package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Credit;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CreditTest {
    Credit credit;
    Credit newCredit;
    public CreditTest() {
    }
    @Test
    public void createTest(){
        credit = new Credit.Builder("10000").identification("1000").amount(5000.00).build();
        Assert.assertEquals(credit.getAmount() , 5000.00);
    }
    @Test
    public void updateTest() {
        newCredit = new Credit.Builder("10000").amount(7000.00).build();
        Assert.assertEquals(newCredit.getAmount(), 7000.00);
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
