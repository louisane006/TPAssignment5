package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Factories.CustomerFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CustomerFactoryImpl implements CustomerFactory {
    private static CustomerFactoryImpl factory = null;

    private  CustomerFactoryImpl() {
    }
    public static CustomerFactoryImpl getInstance(){
        if(factory == null)
            factory = new CustomerFactoryImpl();
        return factory;
    }
    public Customer createCustomer(String identification, String custNum, String name, String surname) {
        Customer customer = new Customer.Builder("10000").idendtification("CI100").name("Sarah").surname("Smith").build();
        return customer;
    }
}
