package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Laptop;
import za.ac.cput.Assign5.com.Domain.Printer;
import za.ac.cput.Assign5.com.Domain.Prints;
import za.ac.cput.Assign5.com.Domain.VideoCamera;

import java.util.List;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class PrinterTest {
    Printer printer;
    Printer newPrinter;
    Laptop laptop;
    List<VideoCamera> camera;
    Prints print;

    public PrinterTest() {
    }
    @Test
    public void createTest(){
        printer = new Printer.Builder().name("Konita Minota").prints(print).build();
        Assert.assertEquals(printer.getName() , "Konita Minota");
    }
    @Test
    public void updateTest() {
        newPrinter = new Printer.Builder().name("Kodak 400").build();
        Assert.assertEquals(newPrinter.getName(), "Kodak 400");
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
