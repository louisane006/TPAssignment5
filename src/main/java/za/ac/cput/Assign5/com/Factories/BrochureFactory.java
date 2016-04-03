package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Brochure;
import za.ac.cput.Assign5.com.Domain.Customer;
import za.ac.cput.Assign5.com.Domain.Designer;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface BrochureFactory {
        Brochure createBrochure(Designer design, String desc, String taskNumber, Customer customer, double price);
    }

