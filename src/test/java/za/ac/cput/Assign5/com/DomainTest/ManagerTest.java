package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Manager;
import za.ac.cput.Assign5.com.Domain.Task;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class ManagerTest {
    Manager manager;
    Manager newManager;
    Task task;
    public ManagerTest() {
    }
    @Test
    public void createTest(){
        manager = new Manager.Builder("44500").id("2100").name("Jonathan").surname("Eddie").task(task).build();
        Assert.assertEquals(manager.getTaskNumber() , "44500");
    }
    @Test
    public void updateTest() {
        newManager = new Manager.Builder("5500B").task(task).build();
        Assert.assertEquals(newManager.getTaskNumber(), "5500B");
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

