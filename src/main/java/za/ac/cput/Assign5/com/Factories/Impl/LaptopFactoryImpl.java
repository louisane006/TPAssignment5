package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Laptop;
import za.ac.cput.Assign5.com.Factories.LaptopFactory;

import java.util.UUID;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class LaptopFactoryImpl implements LaptopFactory {
    private static LaptopFactoryImpl factory = null;

    private  LaptopFactoryImpl() {
    }
    public static LaptopFactoryImpl getInstance(){
        if(factory == null)
            factory = new LaptopFactoryImpl();
        return factory;
    }
    public Laptop createLaptop(String identification, String name, String code, double price) {
        Laptop laptop = new Laptop.Builder().id(UUID.randomUUID().toString()).name(name).code(code).price(price).build();
        return laptop;
    }
}
