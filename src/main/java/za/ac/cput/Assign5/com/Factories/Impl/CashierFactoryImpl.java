package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Cashier;
import za.ac.cput.Assign5.com.Factories.CashierFactory;

import java.util.UUID;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CashierFactoryImpl implements CashierFactory{
    private static CashierFactoryImpl factory = null;

    private CashierFactoryImpl() {
    }
    public static CashierFactoryImpl getInstance(){
        if(factory == null)
            factory = new CashierFactoryImpl();
        return factory;
    }
    public Cashier createCashier(String identification, String name, String surname, String taskNumber) {
        Cashier cashier = new Cashier
                .Builder("10000")
                .identification(UUID.randomUUID().toString())
                .name(name)
                .surname(surname)
                .build();
        return cashier;
    }

}
