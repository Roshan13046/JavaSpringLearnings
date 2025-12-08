package LLD_Sytem_Design.ZoomCarRentalSystem;

import LLD_Sytem_Design.BuilderPattern.User;
import LLD_Sytem_Design.ZoomCarRentalSystem.Store.Store;

import javax.xml.stream.Location;
import java.util.List;
import java.util.Locale;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    getStores(Location location);
    getStoreById(int storeId);
}
