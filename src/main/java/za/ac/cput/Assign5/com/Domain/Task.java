package za.ac.cput.Assign5.com.Domain;

import java.io.Serializable;

/**
 * Created by louisane Malu on 3/28/2016.
 */
public interface Task extends Serializable{
    double cost();

    double price(int unitPrice , double jobDone);
    //String custIdentity(Customer c);
}
