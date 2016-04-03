package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Computer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface ComputerFactory {
    Computer createComputer(String identification, String name, String code, double price) ;

}
