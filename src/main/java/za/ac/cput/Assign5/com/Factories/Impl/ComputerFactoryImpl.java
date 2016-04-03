package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Computer;
import za.ac.cput.Assign5.com.Factories.ComputerFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class ComputerFactoryImpl implements ComputerFactory {
    private static ComputerFactoryImpl factory = null;

    private  ComputerFactoryImpl() {
    }
    public static ComputerFactoryImpl getInstance(){
        if(factory ==null)
            factory = new ComputerFactoryImpl();
        return factory;
    }
    public Computer createComputer(String identification, String name, String code, double price) {
        Computer computer = new Computer.Builder()
                .identification(identification)
                .name(name)
                .code(code)
                .price(price).build();
        return computer;
    }
}
