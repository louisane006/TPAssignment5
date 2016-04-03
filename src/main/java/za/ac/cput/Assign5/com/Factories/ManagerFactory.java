package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Laptop;
import za.ac.cput.Assign5.com.Domain.Manager;
import za.ac.cput.Assign5.com.Domain.SmartScreen;
import za.ac.cput.Assign5.com.Domain.Task;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface ManagerFactory {
    Manager createManager(String identification, String name, String surname, String taskNumber, Task task, SmartScreen screen, Laptop laptop);
}
