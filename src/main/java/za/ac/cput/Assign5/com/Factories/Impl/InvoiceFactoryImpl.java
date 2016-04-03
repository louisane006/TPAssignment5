package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Cashier;
import za.ac.cput.Assign5.com.Domain.Invoice;
import za.ac.cput.Assign5.com.Factories.InvoiceFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class InvoiceFactoryImpl implements InvoiceFactory{
    private static InvoiceFactoryImpl factory = null;

    private  InvoiceFactoryImpl() {
    }
    public static InvoiceFactoryImpl getInstance(){
        if(factory == null)
            factory = new InvoiceFactoryImpl();
        return factory;
    }
    public Invoice createInvoice(String identification, int invoiceNum, Cashier cashier) {
        Invoice invoice = new Invoice.Builder().invoiceNum(invoiceNum).cashier(cashier).build();
        return invoice;
    }
}
