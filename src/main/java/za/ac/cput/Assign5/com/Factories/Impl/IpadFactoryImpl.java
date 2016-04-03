package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Ipad;
import za.ac.cput.Assign5.com.Factories.IpadFactory;

import java.util.UUID;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class IpadFactoryImpl implements IpadFactory {
    private static IpadFactoryImpl factory = null;

    private  IpadFactoryImpl() {
    }
    public static IpadFactoryImpl getInstance(){
        if(factory == null)
            factory = new IpadFactoryImpl();
        return factory;
    }
    public Ipad createIpad(String identification, String name, String code, double price)
    {
        Ipad ipad = new Ipad.Builder().id(UUID.randomUUID().toString()).code(code).name(name).costPrice(price).build();
        return ipad;
    }
}
