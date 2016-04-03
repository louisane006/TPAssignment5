package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Printer;
import za.ac.cput.Assign5.com.Domain.Prints;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface PrinterFactory {
    Printer createPrinter(String identification, String name, String taskId, Prints print);
}
