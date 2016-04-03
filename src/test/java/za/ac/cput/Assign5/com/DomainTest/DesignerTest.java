package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Designer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class DesignerTest {
   Designer designer;
    Designer newDesigner;
    public DesignerTest() {
    }
    @Test
    public void createTest(){
        designer = new Designer.Builder("1000").identification("213015889").name("Louise").surname("Malu").build();
        junit.framework.Assert.assertEquals(designer.getName() , "Louise");
    }
    @Test
    public void updateTest() {
        newDesigner = new Designer.Builder("10000").name("Emily").build();
        Assert.assertEquals(newDesigner.getName(), "Emily");
    }
    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }
    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
