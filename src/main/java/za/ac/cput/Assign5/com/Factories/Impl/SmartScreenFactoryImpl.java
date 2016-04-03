package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.SmartScreen;
import za.ac.cput.Assign5.com.Factories.SmartScreenFactory;

import java.util.UUID;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class SmartScreenFactoryImpl implements SmartScreenFactory {
    private static SmartScreenFactoryImpl factory = null;

    private  SmartScreenFactoryImpl() {
    }
    public static SmartScreenFactoryImpl getInstance(){
        if(factory == null)
            factory = new SmartScreenFactoryImpl();
        return factory;
    }
    public SmartScreen createSmartScreenFactory(String identification, String name, String code, double price)

    {
        SmartScreen screen = new SmartScreen.Builder().id(UUID.randomUUID().toString()).name(name).code(code).costPrice(price).build();
        return screen;
    }
}
