package za.ac.cput.Assign5.com.DomainTest;

import javafx.scene.Camera;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Laptop;
import za.ac.cput.Assign5.com.Domain.Prints;
import za.ac.cput.Assign5.com.Domain.Shop;

import java.util.List;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class ShopTest {
    Shop shop;
    Shop newShop;
    Laptop laptop;
    List<Camera> camera;
    Prints print;

    public ShopTest() {
    }
    @Test
    public void createTest(){
        shop = new Shop.Builder("406, Protea Place, Plumstead").size(500.22).build();
        Assert.assertEquals(shop.getAddress() , "406, Protea Place, Plumstead");
    }
    @Test
    public void updateTest() {
        newShop = new Shop.Builder("55, Long Street, Cape Town").build();
        Assert.assertEquals(newShop.getAddress(), "55, Long Street, Cape Town");
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
