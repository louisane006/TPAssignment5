package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.VideoCamera;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class VideoCameraTest {
    VideoCamera vc;
    VideoCamera newVc;

    public VideoCameraTest() {
    }
    @Test
    public void createTest(){
        vc = new VideoCamera.Builder().id("KDK100").name("Kodak").code("100").costPrice(8500.00).build();
        Assert.assertEquals(vc.getCode() , "100");
    }
    @Test
    public void updateTest() {
        newVc = new VideoCamera.Builder().code("100").build();
        Assert.assertEquals(newVc.getCode(), "100");
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
