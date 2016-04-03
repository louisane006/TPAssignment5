package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Designer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface DesignerFactory {
    public Designer createDesigner(String identification, String name, String surname, String taskNum);
}
