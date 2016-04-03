package za.ac.cput.Assign5.com.Domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by louisane Malu on 4/2/2016.
 */
@Embeddable
public interface Payment extends Serializable {
    String paymentType();
    double costForEverything();
}