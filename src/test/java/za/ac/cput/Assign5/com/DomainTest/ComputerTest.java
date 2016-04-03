package za.ac.cput.Assign5.com.DomainTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign5.com.Domain.Computer;

import static junit.framework.Assert.assertEquals;

/**
 * Created by louisane Malu on 3/29/2016.
 */
public class ComputerTest {
     Computer comp;
     Computer newComp;
    public ComputerTest() {
    }

    @Test
    public void createTest(){
        comp = new Computer.Builder().identification("213015889").name("Accer").code("42365").price(5000).build();
        assertEquals(comp.getName() , "Accer");
    }
    @Test
    public void updateTest() {
        newComp = new Computer.Builder().identification("213015889").name("HP").build();
        assertEquals(newComp.getName(), "HP");
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
