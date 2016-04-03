package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Cashier;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface CashierFactory {
        Cashier createCashier(String identification, String name, String surname, String taskNumber);
        }
