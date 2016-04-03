package za.ac.cput.Assign5.com.Factories.Impl;

import za.ac.cput.Assign5.com.Domain.Parts;
import za.ac.cput.Assign5.com.Domain.Shop;
import za.ac.cput.Assign5.com.Factories.ShopFactory;

import java.util.List;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class ShopFactoryImpl implements ShopFactory{
    private static ShopFactoryImpl factory = null;

    private  ShopFactoryImpl() {
    }
    public static ShopFactoryImpl getInstance(){
        if(factory == null)
            factory = new ShopFactoryImpl();
        return factory;
    }
    public Shop createShop(String identification, double size, String address, List<Parts> part)
    {
        Shop shop = new Shop.Builder("406, Protea Place, Plumstead").size(size).build();
        return shop;
    }
}
