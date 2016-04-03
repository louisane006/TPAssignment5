package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Credit;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface CreditFactory {
    Credit createCredit( String identification, double amount, String name);
}
