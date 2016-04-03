package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Laptop;
import za.ac.cput.Assign5.com.Domain.Manager;
import za.ac.cput.Assign5.com.Domain.SmartScreen;
import za.ac.cput.Assign5.com.Domain.Task;
import za.ac.cput.Assign5.com.Factories.ManagerFactory;

import java.util.UUID;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class ManagerFactoryImpl implements ManagerFactory {
    private static ManagerFactoryImpl factory = null;

    private  ManagerFactoryImpl() {
    }
    public static ManagerFactoryImpl getInstance(){
        if(factory == null)
            factory = new ManagerFactoryImpl();
        return factory;
    }
    public Manager createManager(String identification, String name, String surname, String taskNumber, Task task, SmartScreen screen, Laptop laptop)
    {
        Manager manager = new Manager.Builder("44500").id(UUID.randomUUID().toString()).name(name).surname(surname).task(task).build();
        return manager;
    }
}
