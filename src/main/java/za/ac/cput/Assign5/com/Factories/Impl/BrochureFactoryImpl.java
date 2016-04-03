package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Brochure;
import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Designer;
import za.ac.cput.Assign5.com.Factories.BrochureFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class BrochureFactoryImpl implements BrochureFactory{

    private static BrochureFactoryImpl factory = null;

    private  BrochureFactoryImpl() {
    }
    public static BrochureFactoryImpl getInstance(){
        if(factory ==null)
            factory = new BrochureFactoryImpl();
        return factory;
    }
    public Brochure createBrochure(Designer designer, String desc, String taskNumber, Customer customer, double price) {
        Brochure brochure = new Brochure
                .Builder()
                .designer(designer)
                .customer(customer)
                .taskNum(taskNumber)
                .price(price)
                .build();
        return brochure;
    }
}
