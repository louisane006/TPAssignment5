package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Printer;
import za.ac.cput.Assign5.com.Domain.Prints;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface PrintsFactory {
    Prints createPrints(Printer printer,String desc, Customer customer, String taskId, double price);
}
