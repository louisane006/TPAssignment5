package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.SmartScreen;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface SmartScreenFactory {
    SmartScreen createSmartScreenFactory(String identification, String name, String code, double price);
}
