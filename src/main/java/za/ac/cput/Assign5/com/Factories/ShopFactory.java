package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.Parts;
import za.ac.cput.Assign5.com.Domain.Shop;

import java.util.List;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface ShopFactory {
    Shop createShop(String identification, double size, String address, List<Parts> part);
}
