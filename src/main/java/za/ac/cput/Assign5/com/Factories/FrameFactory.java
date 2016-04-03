package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Designer;
import za.ac.cput.Assign5.com.Domain.Frame;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface FrameFactory {
    Frame createFrame(Designer designer, String desc, String taskId, Customer customer);
}
