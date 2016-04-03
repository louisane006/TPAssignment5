package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Credit;
import za.ac.cput.Assign5.com.Factories.CreditFactory;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CreditFactoryImpl implements CreditFactory {
    private static CreditFactoryImpl factory = null;

    private  CreditFactoryImpl() {
    }
    public static CreditFactoryImpl getInstance(){
        if(factory == null)
            factory = new CreditFactoryImpl();
        return factory;
    }
    public Credit createCredit( String identification, double amount, String name) {
        Credit credit = new Credit.Builder("10000").identification("1000").amount(5000.00).build();
        return credit;
    }
}
