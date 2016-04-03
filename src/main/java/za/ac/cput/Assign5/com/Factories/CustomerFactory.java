package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Customer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface CustomerFactory {
    Customer createCustomer(String identification, String custNum, String name, String surname);
}
