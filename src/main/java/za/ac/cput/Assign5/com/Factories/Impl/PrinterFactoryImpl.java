package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Printer;
import za.ac.cput.Assign5.com.Domain.Prints;
import za.ac.cput.Assign5.com.Factories.PrinterFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class PrinterFactoryImpl implements PrinterFactory {
    private static PrinterFactoryImpl factory = null;

    private  PrinterFactoryImpl() {
    }
    public static PrinterFactoryImpl getInstance(){
        if(factory == null)
            factory = new PrinterFactoryImpl();
        return factory;
    }
    public Printer createPrinter(String identification, String name, String taskId, Prints print)
    {
       Printer printer = new Printer.Builder().name(name).prints(print).build();
        return printer;
    }
}
