package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Cashier;
import za.ac.cput.Assign5.com.Domain.Invoice;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface InvoiceFactory {
    Invoice createInvoice(String identification, int invoiceNum, Cashier cashier);
}
