package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Designer;
import za.ac.cput.Assign5.com.Domain.Frame;
import za.ac.cput.Assign5.com.Factories.FrameFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class FrameFactoryImpl implements FrameFactory{
    private static FrameFactoryImpl factory = null;
    Designer designer;
    Customer customer;

    private  FrameFactoryImpl() {
    }
    public static FrameFactoryImpl getInstance(){
        if(factory == null)
            factory = new FrameFactoryImpl();
        return factory;
    }
    public Frame createFrame(Designer designer, String desc, String taskId, Customer customer) {
        Frame frame = new Frame.Builder().designer(designer).desc("CI1000").taskId("2000").customer(customer).build();
        return frame;
    }
}
