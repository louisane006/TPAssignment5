package za.ac.cput.Assign5.com.DomainTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.Assign5.com.Domain.Cashier;
import za.ac.cput.Assign5.com.Domain.Invoice;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class InvoiceTest {
    Invoice invoice;
    Invoice newInvoice;
    Cashier cashier;
    public InvoiceTest() {
    }
    @Test
    public void createTest(){
        invoice = new Invoice.Builder().invoiceNum(40500).cashier(cashier).build();
        Assert.assertEquals(invoice.getInvoiceNum() , 40500);
    }
    @Test
    public void updateTest() {
        newInvoice = new Invoice.Builder().invoiceNum(41500).build();
        Assert.assertEquals(newInvoice.getInvoiceNum(), 41500);
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
